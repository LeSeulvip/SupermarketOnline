package top.leseul.supermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.supermarketonline.entity.TbSubType;
import top.leseul.supermarketonline.entity.TbType;

/**
 * TbSubType的数据访问层
 * 
 * @author LeSeul
 *
 */
@Mapper
public interface TbSubTypeDAO {

  /**
   * -查询可用的TbType
   * 
   * @return TbType
   * @throws Exception 处理发生异常
   */
  List<TbType> queryTypes() throws Exception;

  /**
   * -查询小分类信息
   * 
   * @return 小分类信息
   * @throws Exception 处理发生异常
   */
  List<TbSubType> queryAll() throws Exception;

  /**
   * -添加小分类信息
   * 
   * @param subType 小分类信息
   * @return 添加小分类信息结果
   * @throws Exception 处理发生异常
   */
  int add(TbSubType subType) throws Exception;

  /**
   * -修改小分类信息
   * 
   * @param subType 小分类信息
   * @return 修改小分类信息结果
   * @throws Exception 处理发生异常
   */
  int update(TbSubType subType) throws Exception;

  /**
   * -修改启用状态
   * 
   * @param subType 修改启用状态
   * @return 修改启用状态结果
   * @throws Exception 处理发生异常
   */
  int updateIsEnable(TbSubType subType) throws Exception;

  /**
   * -按照tid和subName查询小类信息
   * 
   * @param subType 小类信息
   * @return 小类信息
   * @throws Exception 处理发生异常
   */
  TbSubType qyeryByTidSubName(TbSubType subType) throws Exception;

  /**
   * -按照主键查询
   * 
   * @param subType 信息
   * @return 信息
   * @throws Exception 处理发生异常
   */
  TbSubType qyeryByKey(TbSubType subType) throws Exception;

}
