package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbAdminUserDAO;
import top.leseul.supermarketonline.dao.TbLogsDAO;
import top.leseul.supermarketonline.entity.TbAdminUser;
import top.leseul.supermarketonline.entity.TbLogs;
import top.leseul.supermarketonline.entity.TbTokenInfo;
import top.leseul.supermarketonline.model.AdminUserModel;
import top.leseul.supermarketonline.service.AdminUserService;
import top.leseul.supermarketonline.utils.JsonMessage;
import top.leseul.supermarketonline.utils.MyUtils;

/**
 * - 管理用户服务
 * 
 * @author LeSeul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminUserServiceImpl implements AdminUserService {

  private static final String USER_ISENABLE = "y";
  @Autowired
  private TbAdminUserDAO tbAdminUserDAO;

  @Autowired
  private TbLogsDAO tbLogsDAO;

  @Override
  public JsonMessage login(AdminUserModel model) throws Exception {
    TbAdminUser user = model.getUser();
    if (MyUtils.isEmpty(user.getUsername())) {
      return JsonMessage.getFail("用户名必须填写");
    }
    if (MyUtils.isEmpty(user.getPassword())) {
      return JsonMessage.getFail("密码必须填写");
    }
    TbAdminUser suser = tbAdminUserDAO.queryByUsername(user);
    if (suser == null) {
      return JsonMessage.getFail("用户名不存在");
    }
    if (!USER_ISENABLE.equalsIgnoreCase(suser.getIsEnable())) {
      return JsonMessage.getFail("用户已禁用");
    }
    // equalsIgnoreCase判断不区分大小写
    if (!suser.getPassword().equalsIgnoreCase(user.getPassword())) {
      return JsonMessage.getFail("密码错误");
    }
    // 登录成功需要添加tokeninfo
    TbTokenInfo tokenInfo = model.makeTbTokenInfo();
    tokenInfo.setInfo(suser.getAuid() + "");
    // 查看是否存在token中是否存在
    TbAdminUser tuser = tbAdminUserDAO.queryTokenUser(tokenInfo);
    if (tuser != null) {
      // 存在就删除
      tbAdminUserDAO.deleteTokenUser(tokenInfo);
    }
    tbAdminUserDAO.saveUserToToken(tokenInfo);
    // 记录登录信息
    TbLogs logs = new TbLogs();
    // 用户id
    logs.setOperator(tokenInfo.getInfo());
    logs.setLogtype("login");
    logs.setLog("用户登录");
    tbLogsDAO.add(logs);
    return JsonMessage.getSuccess("登录成功");
  }

  @Override
  public JsonMessage getUserInfo(AdminUserModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    TbAdminUser user = tbAdminUserDAO.queryTokenUser(model.makeTbTokenInfo());
    if (user != null) {
      // 去掉敏感信息
      user.setAuid(null);
      user.setPassword(null);
    }
    message.put("user", user);
    return message;
  }

  @Override
  public JsonMessage logout(AdminUserModel model) throws Exception {
    tbAdminUserDAO.deleteTokenUser(model.makeTbTokenInfo());
    return JsonMessage.getSuccess("登出成功");
  }

}
