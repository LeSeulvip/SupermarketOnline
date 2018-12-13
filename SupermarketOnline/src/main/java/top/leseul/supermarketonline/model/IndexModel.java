package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BaseModel;

/**
 * -首页model
 *
 * @author leseul
 *
 */
public class IndexModel extends BaseModel {
  private static final long serialVersionUID = 7552454824988006531L;

  private String echo;

  public IndexModel() {
  }

  public String getEcho() {
    return echo;
  }

  public void setEcho(String echo) {
    this.echo = echo;
  }

}
