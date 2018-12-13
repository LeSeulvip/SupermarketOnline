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
   * @return
   * @throws Exception
   */
  JsonMessage index() throws Exception;

}
