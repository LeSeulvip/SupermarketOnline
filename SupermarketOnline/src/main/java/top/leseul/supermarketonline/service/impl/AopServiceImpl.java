package top.leseul.supermarketonline.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbAdminUserDAO;
import top.leseul.supermarketonline.dao.TbTokenDAO;
import top.leseul.supermarketonline.entity.TbAdminUser;
import top.leseul.supermarketonline.entity.TbToken;
import top.leseul.supermarketonline.entity.TbTokenInfo;
import top.leseul.supermarketonline.service.AopService;
import top.leseul.supermarketonline.utils.MyUtils;

/**
 *
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AopServiceImpl implements AopService {
  @Autowired
  private TbTokenDAO tbTokenDAO;

  @Autowired
  private TbAdminUserDAO tbAdminUserDAO;
  /**
   * makeNewToken-创建一个新的token
   *
   * @return
   * @throws Exception
   */
  private TbToken makeNewToken() throws Exception {
    // 通过uuid生成随机的token
    String t = UUID.randomUUID().toString();
    TbToken stoken = new TbToken();
    stoken.setToken(t);
    // 保存到数据库
    tbTokenDAO.addToken(stoken);
    return stoken;
  }

  @Override
  public TbToken createOrUpdateToken(TbToken token) throws Exception {
    // 传入的token信息不存在就返回新的
    if (token == null || MyUtils.isEmpty(token.getToken())) {
      return makeNewToken();
    }
    // 数据库校验token信息，不存在就返回新的
    TbToken stoken = tbTokenDAO.queryToken(token);
    if (stoken == null) {
      return makeNewToken();
    }
    // 存在就更新
    tbTokenDAO.updateToken(stoken);
    return stoken;
  }

  @Override
  public TbAdminUser checkAdminUser(TbToken token) throws Exception {
    if (token == null) {
      return null;
    }
    // 查询登录用户信息
    TbTokenInfo tokenInfo = new TbTokenInfo();
    tokenInfo.setToken(token.getToken());
    TbAdminUser user = tbAdminUserDAO.queryTokenUser(tokenInfo);
    return user;
  }

}
