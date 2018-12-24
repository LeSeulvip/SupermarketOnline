package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.model.AdminUserModel;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 *  -管理用户服务
 * @author LeSeul
 *
 */
public interface AdminUserService {

  /**
   * -用户登录
   * @param model 页面数据
   * @return 用户登录结果 
   * @throws Exception 处理数据发生错误
   */
  JsonMessage login(AdminUserModel model) throws Exception;

  /**
   * -用户登出
   * @param model 页面数据
   * @return 用户登出结果 
   * @throws Exception 处理数据发生错误
   */
  JsonMessage logout(AdminUserModel model) throws Exception;

  /**
   * -查询当前用户登录信息
   * @param model 页面数据
   * @return 当前登录用户信息
   * @throws Exception 处理数据发生错误
   */
  JsonMessage getUserInfo(AdminUserModel model) throws Exception;

}
