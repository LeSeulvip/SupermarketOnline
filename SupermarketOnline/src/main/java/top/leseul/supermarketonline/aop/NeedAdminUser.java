package top.leseul.supermarketonline.aop;

import top.leseul.supermarketonline.entity.TbAdminUser;

/**
 * -需要登录的接口定义
 * 
 * @author LeSeul
 *
 */
public interface NeedAdminUser {

  /**
   * -设置登录用户信息
   * 
   * @param user
   */
  public void setUSer(TbAdminUser user);

  /**
   * -获取用户登录信息
   * 
   * @return
   */
  public TbAdminUser getUser();

}
