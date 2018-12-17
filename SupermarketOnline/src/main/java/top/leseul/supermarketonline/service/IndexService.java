package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * Index服务类
 *
 * @author leseul
 *
 */
public interface IndexService {

  /**
   * -首页显示信息
   * 
   * @return 首页显示信息结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage index() throws Exception;

}
