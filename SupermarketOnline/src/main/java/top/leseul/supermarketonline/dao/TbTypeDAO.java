package top.leseul.supermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.supermarketonline.entity.TbType;

/**
 * -TbType数据访问类
 * 
 * @author LeSeul
 *
 */
@Mapper
public interface TbTypeDAO {
  /**
   * -分页查询
   * 
   * @return 分页查询结果
   * @throws Exception 处理发生错误
   */
  public List<TbType> queryAll() throws Exception;

  /**
   * -按主键查询
   * 
   * @return TbType主键
   * @throws Exception 处理发生错误
   */
  public TbType queryByKey() throws Exception;

  /**
   * -添加
   * 
   * @param tbType 添加数据
   * @return 添加结果
   * @throws Exception 处理发生错误
   */
  int add(TbType tbType) throws Exception;

  /**
   * -修改
   * 
   * @param tbType 修改数据
   * @return 修改结果
   * @throws Exception 处理发生错误
   */
  int modify(TbType tbType) throws Exception;

  /**
   * -删除（停用）
   * 
   * @param tbType 删除数据
   * @return 删除或者反删除结果
   * @throws Exception 处理发生错误
   */
  int delete(TbType tbType) throws Exception;

}
