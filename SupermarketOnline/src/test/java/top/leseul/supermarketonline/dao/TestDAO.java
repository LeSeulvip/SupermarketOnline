package top.leseul.supermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.supermarketonline.entity.TbToken;

/**
 * -测试dao
 *
 * @author leseul
 *
 */
@Mapper
public interface TestDAO {

  /**
   * -查询token
   *
   * @return
   * @throws Exception
   */
  List<TbToken> queryTokens() throws Exception;
}
