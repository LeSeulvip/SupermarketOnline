package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.utils.JsonMessage;
import top.leseul.supermarketonline.utils.PageBean;

/**
 * - 测试服务
 *
 * @author leseul
 *
 */
public interface TestService {

  /**
   * -分页查询token
   *
   * @param page
   * @return
   * @throws Exception
   */
  JsonMessage queryTokens(PageBean page) throws Exception;

}
