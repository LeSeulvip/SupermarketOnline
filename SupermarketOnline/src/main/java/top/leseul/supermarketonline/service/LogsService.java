package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.model.LogsModel;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * TbLogs的Service
 * @author LeSeul
 *
 */
public interface LogsService {

  /**
   * 查询Tblogs信息
   * @param model 页面参数
   * @return Tblogs信息
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(LogsModel model) throws Exception;

}
