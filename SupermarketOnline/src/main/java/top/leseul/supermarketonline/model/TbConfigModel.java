package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BaseModel;
import top.leseul.supermarketonline.entity.TbConfig;

/**
 * TbConfig模型层
 * 
 * @author LeSeul
 *
 */
public class TbConfigModel extends BaseModel {

  private static final long serialVersionUID = -3546478196826716817L;

  private TbConfig config = new TbConfig();

  public TbConfigModel() {
  }

  public TbConfig getConfig() {
    return config;
  }

  public void setConfig(TbConfig config) {
    this.config = config;
  }

}
