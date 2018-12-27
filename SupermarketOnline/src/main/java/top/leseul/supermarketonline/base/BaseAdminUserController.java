package top.leseul.supermarketonline.base;

import top.leseul.supermarketonline.aop.NeedAdminUser;
import top.leseul.supermarketonline.entity.TbAdminUser;

public abstract class BaseAdminUserController implements NeedAdminUser {

  /**
   * 登录用户信息
   */
  private TbAdminUser user;

  @Override
  public TbAdminUser getUser() {
    return user;
  }

  @Override
  public void setUser(TbAdminUser user) {
    this.user = user;
  }
}
