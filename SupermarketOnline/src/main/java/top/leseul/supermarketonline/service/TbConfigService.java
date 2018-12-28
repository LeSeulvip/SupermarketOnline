package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.model.TbConfigModel;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * TbConfig的服务层
 * @author LeSeul
 *
 */
public interface TbConfigService {

  /**
   * 修改token过期时间
   * @param model 页面提交数据
   * @return 修改token过期时间的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage updateTokenTimeout(TbConfigModel model) throws Exception;

  /**
   * 查询后台配置
   * @param model 页面提交数据
   * @return 后台配置
   * @throws Exception 处理发生错误
   */
  JsonMessage queryConfig(TbConfigModel model) throws Exception;

  /**
   * 查询网站标题配置
   * @param model 页面提交数据
   * @return 网站标题配置 
   * @throws Exception 处理发生错误
   */
  JsonMessage updateTitle(TbConfigModel model) throws Exception;

  /**
   * 
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage queryWebConfig(TbConfigModel model) throws Exception;

}
