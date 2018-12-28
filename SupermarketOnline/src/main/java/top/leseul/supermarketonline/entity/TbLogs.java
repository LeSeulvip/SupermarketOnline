package top.leseul.supermarketonline.entity;

import java.util.Date;

import top.leseul.supermarketonline.base.BaseEntity;

/**
 * TbLogs表
 * 
 * @author LeSeul
 *
 */
public class TbLogs extends BaseEntity {

  public Integer getLid() {
    return lid;
  }

  public void setLid(Integer lid) {
    this.lid = lid;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getLog() {
    return log;
  }

  public void setLog(String log) {
    this.log = log;
  }

  public String getLogtype() {
    return logtype;
  }

  public void setLogtype(String logtype) {
    this.logtype = logtype;
  }

  public Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }

  private static final long serialVersionUID = -6731432146091429438L;
  
  private Integer lid;
  private String operator;
  private String log;
  private String logtype;
  private Date lastupdate;

  public TbLogs() {
  }

 

}