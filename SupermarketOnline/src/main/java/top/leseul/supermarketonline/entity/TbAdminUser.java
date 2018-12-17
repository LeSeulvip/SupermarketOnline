package top.leseul.supermarketonline.entity;

import java.util.Date;

import top.leseul.supermarketonline.base.BaseEntity;

/**
 * TbAdminUser实体层
 * 
 * @author LeSeul
 *
 */
public class TbAdminUser extends BaseEntity {

  private static final long serialVersionUID = 8641362965707803550L;

  private Integer auid;
  private String username;
  private String password;
  private String nickname;
  private String isEnable;
  private Date lastupdate;

  public TbAdminUser() {
  }

  public Integer getAuid() {
    return auid;
  }

  public void setAuid(Integer auid) {
    this.auid = auid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }

  public Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }

}
