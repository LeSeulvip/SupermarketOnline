package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbAdminUserDAO;
import top.leseul.supermarketonline.entity.TbAdminUser;
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
public class AdminUserServiceimpl implements AdminUserService {

  @Autowired
  private TbAdminUserDAO tbAdminUserDAO;

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
    if (!"y".equalsIgnoreCase(suser.getIsEnable())) {
      return JsonMessage.getFail("用户已禁用");
    }
    // equalsIgnoreCase判断不区分大小写
    if (suser.getPassword().equalsIgnoreCase(user.getPassword())) {
      return JsonMessage.getFail("密码错误");
    }
    return JsonMessage.getSuccess("登录成功");
  }

  @Override
  public JsonMessage getUserInfo(AdminUserModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("user", tbAdminUserDAO.queryTokenUser(model.makeTbTokenInfo()));
    return message;
  }

  @Override
  public JsonMessage logout(AdminUserModel model) throws Exception {
    tbAdminUserDAO.deleteTokenUser(model.makeTbTokenInfo());
    return JsonMessage.getSuccess("登出成功");
  }

}
