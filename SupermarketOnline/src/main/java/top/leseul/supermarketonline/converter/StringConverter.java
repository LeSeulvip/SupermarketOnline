package top.leseul.supermarketonline.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import top.leseul.supermarketonline.utils.MyUtils;

/**
 * String数值转换器
 *
 * @author leseul
 *
 */
@Component
public class StringConverter implements Converter<String, String> {

  @Override
  public String convert(String source) {
    return MyUtils.trim(source);
  }

}
