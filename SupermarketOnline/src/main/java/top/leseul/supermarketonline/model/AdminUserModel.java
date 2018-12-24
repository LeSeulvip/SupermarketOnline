package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BaseModel;
import top.leseul.supermarketonline.entity.TbAdminUser;

/**
 * -管理用户model
 */
public class AdminUserModel extends BaseModel {

  private static final long serialVersionUID = 2231113117741187474L;

  private TbAdminUser user = new TbAdminUser();

  public AdminUserModel() {
  }

  public TbAdminUser getUser() {
    return user;
  }

  public void setUser(TbAdminUser user) {
    this.user = user;
  }

}
