package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbConfigDAO;
import top.leseul.supermarketonline.dao.TbLogsDAO;
import top.leseul.supermarketonline.entity.TbLogs;
import top.leseul.supermarketonline.model.TbConfigModel;
import top.leseul.supermarketonline.service.TbConfigService;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * TbConfig服务层
 * 
 * @author LeSeul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbConfigImpl implements TbConfigService {

  @Autowired
  private TbConfigDAO tbConfigDAO;

  @Autowired
  private TbLogsDAO tbLogsDAO;

  @Override
  public JsonMessage queryWebConfig(TbConfigModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("title", tbConfigDAO.queryTitle());
    return message;
  }

  @Override
  public JsonMessage queryConfig(TbConfigModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("tokenTimeout", tbConfigDAO.queryTokenTimeout());
    message.put("title", tbConfigDAO.queryTitle());
    return message;
  }

  @Override
  public JsonMessage updateTokenTimeout(TbConfigModel model) throws Exception {
    int result = tbConfigDAO.updateTokenTimeout(model.getConfig());
    // 添加日志信息
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("configmanage");
    logs.setLog(String.format("修改了：%s", model.getConfig()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
  }

  @Override
  public JsonMessage updateTitle(TbConfigModel model) throws Exception {
    int result = tbConfigDAO.updateTitle(model.getConfig());
    // 添加日志信息
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("configmanage");
    logs.setLog(String.format("修改了：%s", model.getConfig()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
  }
}
