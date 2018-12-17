package top.leseul.supermarketonline.service;

/**
 * -计划任务服务
 *
 * @author leseul
 *
 */
public interface ScheduleTaskService {

  /**
   * -删除过期的token
   *
   * @return 过期的token数量
   * @throws Exception 处理数据发生错误
   */
  int deleteTokens() throws Exception;
}
