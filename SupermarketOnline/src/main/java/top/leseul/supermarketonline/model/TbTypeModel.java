package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BasePageModel;
import top.leseul.supermarketonline.entity.TbType;

/**
 * TbType的模型层
 * @author LeSeul
 *
 */
public class TbTypeModel extends BasePageModel {

  private static final long serialVersionUID = -6719908212629978161L;

  private TbType tbType = new TbType();

  public TbTypeModel() {
  }

  public TbType getTbType() {
    return tbType;
  }

  public void setTbType(TbType tbType) {
    this.tbType = tbType;
  }

}
