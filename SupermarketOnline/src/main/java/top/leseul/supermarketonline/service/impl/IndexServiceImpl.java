package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.leseul.supermarketonline.config.MyConfig;
import top.leseul.supermarketonline.converter.DateConverter;
import top.leseul.supermarketonline.dao.UtilsDAO;
import top.leseul.supermarketonline.service.IndexService;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 *
 * @author leseul
 *
 */
@Service
public class IndexServiceImpl implements IndexService {
  @Autowired
  private MyConfig myConfig;
  @Autowired
  private UtilsDAO utilsDAO;

  @Override
  public JsonMessage index() throws Exception {
    JsonMessage message = JsonMessage.getSuccess(String.format("欢迎使用%s，%s", myConfig.appName, DateConverter.SDF_LONG.format(utilsDAO.queryTime())));
    return message;
  }

}
