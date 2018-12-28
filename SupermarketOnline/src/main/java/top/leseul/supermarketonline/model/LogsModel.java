package top.leseul.supermarketonline.model;

import top.leseul.supermarketonline.base.BasePageModel;
import top.leseul.supermarketonline.entity.TbLogs;

/**
 * TbLogs的Model
 * 
 * @author DarkKnight
 *
 */
public class LogsModel extends BasePageModel {

  private static final long serialVersionUID = 3023904855447273529L;
  private TbLogs tbLogs = new TbLogs();

  public LogsModel() {
  }

  public TbLogs getTbLogs() {
    return tbLogs;
  }

  public void setTbLogs(TbLogs tbLogs) {
    this.tbLogs = tbLogs;
  }
  
  

}