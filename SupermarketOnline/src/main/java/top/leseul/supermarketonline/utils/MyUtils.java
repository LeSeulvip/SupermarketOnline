package top.leseul.supermarketonline.utils;

/**
 * MyUtils-工具包
 *
 * @author leseul
 *
 */
public class MyUtils {

  /**
   * - 回车换行
   */
  public static final String CRLF = String.format("%n");

  /**
   * isEmpty-判断是否是null或者是全部都是空白字符
   *
   * @param value 判断是否是null或者是全部都是空白字符
   * @return 判断是否是null或者是全部都是空白字符的结果
   */
  public static boolean isEmpty(String value) {
    return value == null || "".equals(value.trim());
  }

  /**
   * trim-去掉头尾空白字符，null值也會返回成空字符串
   *
   * @param value 去掉头尾空白字符
   * @return 去掉头尾空白字符，null值也會返回成空字符串的结果
   */
  public static String trim(String value) {
    if (isEmpty(value)) {
      return "";
    }
    return value.trim();
  }
}
