package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.model.TbSubTypeModel;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * TbSubType服务层
 * 
 * @author LeSeul
 *
 */
public interface SubTypeService {

  /**
   * 禁用
   * 
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage disable(TbSubTypeModel model) throws Exception;

  /**
   * 启用
   * 
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage enable(TbSubTypeModel model) throws Exception;

  /**
   * 修改
   * 
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage update(TbSubTypeModel model) throws Exception;

  /**
   * 查询
   * 
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage queryAll(TbSubTypeModel model) throws Exception;

  /**
   * 添加
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage add(TbSubTypeModel model) throws Exception;

}
