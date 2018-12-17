package top.leseul.supermarketonline.entity;

import java.util.Date;

import top.leseul.supermarketonline.base.BaseEntity;

/**
 * TbSubType实体层
 * 
 * @author LeSeul
 *
 */
public class TbSubType extends BaseEntity {

  private static final long serialVersionUID = 7531767287683205573L;

  private Integer stid;
  private Integer tid;
  private String subName;
  private String subInfo;
  private String isEnable;
  private Date lastupdate;

  public TbSubType() {
  }

  public Integer getStid() {
    return stid;
  }

  public void setStid(Integer stid) {
    this.stid = stid;
  }

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getSubInfo() {
    return subInfo;
  }

  public void setSubInfo(String subInfo) {
    this.subInfo = subInfo;
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
