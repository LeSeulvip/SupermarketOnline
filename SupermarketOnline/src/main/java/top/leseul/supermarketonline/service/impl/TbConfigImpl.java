package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbConfigDAO;
import top.leseul.supermarketonline.model.TbConfigModel;
import top.leseul.supermarketonline.service.TbConfigService;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * TbConfig服务层
 * @author LeSeul
 *
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class TbConfigImpl implements TbConfigService {

  @Autowired
  private TbConfigDAO tbConfigDAO;
  
  @Override
  public JsonMessage queryConfig(TbConfigModel model)throws Exception{
    JsonMessage message=JsonMessage.getSuccess("");
    message.put("tokenTimeout", tbConfigDAO.queryTokenTimeout());
    message.put("title", tbConfigDAO.queryTitle());
    return message;
  }
  
  @Override
  public JsonMessage updateTokenTimeout(TbConfigModel model)throws Exception{
    int result =tbConfigDAO.updateTokenTimeout(model.getConfig());
    return result==1?JsonMessage.getSuccess("修改成功"):JsonMessage.getFail("修改失败");
  }
  
  @Override
  public JsonMessage updateTitle(TbConfigModel model)throws Exception{
    int result =tbConfigDAO.updateTitle(model.getConfig());
    return result==1?JsonMessage.getSuccess("修改成功"):JsonMessage.getFail("修改失败");
  }
}
