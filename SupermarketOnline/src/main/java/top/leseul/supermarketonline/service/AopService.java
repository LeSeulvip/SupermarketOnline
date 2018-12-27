package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.entity.TbAdminUser;
import top.leseul.supermarketonline.entity.TbToken;

/**
 * -切面用的服务类
 *
 * @author leseul
 *
 */
public interface AopService {

  /**
   * -创建或者更新token
   *
   * @param token 客户端传入的token
   * @return 更新token结果
   * @throws Exception 处理数据发生错误
   */
  TbToken createOrUpdateToken(TbToken token) throws Exception;
  
  /**
   * 查询登录用户信息
   * 
   * @param token token信息
   * @return 登录用户信息
   * @throws Exception 处理发生错误
   */
  TbAdminUser checkAdminUser(TbToken token) throws Exception;

}
