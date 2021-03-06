package top.leseul.supermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.supermarketonline.entity.TbLogs;

/**
 * TbLogs的dao
 * 
 * @author LeSeul
 *
 */
@Mapper
public interface TbLogsDAO {
  /**
   * 分页查询
   * 
   * @param logs 查询参数
   * @return 分页查询结果
   * @throws Exception 处理发生异常
   */
  public List<TbLogs> queryAll(TbLogs logs) throws Exception;

  /**
   * 添加log
   * 
   * @param tbLogs log信息
   * @return 添加log结果
   * @throws Exception 处理发生异常
   */
  public int add(TbLogs tbLogs) throws Exception;
}