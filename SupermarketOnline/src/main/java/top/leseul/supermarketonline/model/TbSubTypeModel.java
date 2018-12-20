package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BasePageModel;
import top.leseul.supermarketonline.entity.TbSubType;

/**
 * TbSubType模型层
 * @author LeSeul
 *
 */
public class TbSubTypeModel extends BasePageModel {
  
  private static final long serialVersionUID = 6164700344016808951L;
  
  private TbSubType subType = new TbSubType();
  
  public TbSubTypeModel() {
  }

  public TbSubType getSubType() {
    return subType;
  }

  public void setSubType(TbSubType subType) {
    this.subType = subType;
  }
  
  
  
  
  

}
