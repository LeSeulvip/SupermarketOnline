package top.leseul.supermarketonline.dao;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.supermarketonline.entity.TbAdminUser;
import top.leseul.supermarketonline.entity.TbTokenInfo;

/**
 * TbAdminUser数据访问层
 * 
 * @author LeSeul
 *
 */
@Mapper
public interface TbAdminUserDAO {

  /**
   * -按用户名查询用户信息
   * 
   * @param user 用户信息
   * @return 按用户名查询用户信息的结果
   * @throws Exception 处理发生异常
   */
  TbAdminUser queryByUsername(TbAdminUser user) throws Exception;

  /**
   * -按主键查询用户信息
   * 
   * @param user 用户信息
   * @return 按主键查询用户信息的结果
   * @throws Exception 处理发生异常
   */
  TbAdminUser queryByKey(TbAdminUser user) throws Exception;

  /**
   * -查询用户登录相关信息
   * 
   * @param tokenInfo 用户登录信息
   * @return 查询用户登录相关信息的结果
   * @throws Exception 处理发生异常
   */
  TbAdminUser queryTokenUser(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -添加登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 添加登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int saveUserToToken(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -修改登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 修改登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int updateTokenUser(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -移除登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 移除登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int deleteTokenUser(TbTokenInfo tokenInfo) throws Exception;

}
