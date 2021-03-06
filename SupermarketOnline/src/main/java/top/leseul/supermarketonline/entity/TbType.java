package top.leseul.supermarketonline.entity;

import java.util.Date;

import top.leseul.supermarketonline.base.BaseEntity;

/**
 * TbType实体层
 * @author LeSeul
 *
 */
public class TbType extends BaseEntity {

  private static final long serialVersionUID = -962466863327691211L;
  
  private Integer tid;
  private String typeName;
  private String typeInfo;
  private String isEnable;
  private Date lastupdate;
  
  public TbType() {
  }

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getTypeInfo() {
    return typeInfo;
  }

  public void setTypeInfo(String typeInfo) {
    this.typeInfo = typeInfo;
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
