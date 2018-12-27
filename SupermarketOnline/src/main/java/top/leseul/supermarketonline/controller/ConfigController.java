package top.leseul.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.leseul.supermarketonline.base.BaseAdminUserController;
import top.leseul.supermarketonline.model.TbConfigModel;
import top.leseul.supermarketonline.service.TbConfigService;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * 
 * @author LeSeul
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController extends BaseAdminUserController {
  @Autowired 
  private TbConfigService tbConfigService;
  
  @RequestMapping("/queryConfig")
  public JsonMessage queryConfig(TbConfigModel model)throws Exception{
    return tbConfigService.queryConfig(model);
  }
  
  @RequestMapping("/updateTokenTimeout")
  public JsonMessage updateTokenTimeOut(TbConfigModel model)throws Exception{
    return tbConfigService.updateTokenTimeout(model);
  }
  
  @RequestMapping("/updateTitle")
  public JsonMessage updateTitle(TbConfigModel model)throws Exception{
    return tbConfigService.updateTitle(model);
  }
}
