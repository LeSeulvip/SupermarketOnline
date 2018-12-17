package top.leseul.supermarketonline.service;

import top.leseul.supermarketonline.entity.TbTokenInfo;

/**
 * -工具服务
 *
 * @author leseul
 *
 */
public interface UtilService {

  /**
   * - 获取图片校验码
   *
   * @param tokenInfo 获取图片校验码
   * @return 图片校验码的结果
   * @throws Exception 处理数据发生错误
   */
  String imageCode(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -查看校验码是否正确
   *
   * @param tokenInfo 查看校验码是否正确
   * @return 查看校验码是否正确的结果
   * @throws Exception 处理数据发生错误
   */
  boolean checkImageCode(TbTokenInfo tokenInfo) throws Exception;

}
