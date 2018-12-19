package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.model.TbTypeModel;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * 
 * @author LeSeul
 *
 */
public interface TypeService {

  /**
   * -查询全部
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage queryAll(TbTypeModel model) throws Exception;

  /**
   * -按名称查询
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage add(TbTypeModel model) throws Exception;

  /**
   * 修改
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage modify(TbTypeModel model) throws Exception;

  /**
   * 删除
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage delete(TbTypeModel model) throws Exception;

  /**
   * 按主键查询
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage queryByKey(TbTypeModel model) throws Exception;

  /**
   * 启用 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理数据发生错误
   */
  JsonMessage undelete(TbTypeModel model) throws Exception;

}
