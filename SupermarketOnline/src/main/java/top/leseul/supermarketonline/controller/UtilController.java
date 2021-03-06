package top.leseul.supermarketonline.controller;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.leseul.supermarketonline.entity.TbTokenInfo;
import top.leseul.supermarketonline.model.TbConfigModel;
import top.leseul.supermarketonline.model.UtilModel;
import top.leseul.supermarketonline.service.TbConfigService;
import top.leseul.supermarketonline.service.UtilService;
import top.leseul.supermarketonline.utils.ImageCode;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * -工具类控制器
 *
 * @author leseul
 *
 */
@RestController
@RequestMapping("/util")
public class UtilController {

  @Autowired
  private UtilService utilService;
  
  @Autowired
  private TbConfigService tbconfigService;

  @RequestMapping("/validate.jpg")
  public void imageCode(UtilModel model, HttpServletResponse response) throws Exception {
    // http://127.0.0.1:14000/util/validate.jpg?token=5bc8c8a6-63c7-421e-905b-a89a9fd1bb63
    TbTokenInfo tokenInfo = model.makeTbTokenInfo();
    ImageIO.write(ImageCode.makeImage(utilService.imageCode(tokenInfo)), "jpeg", response.getOutputStream());
  }
  
  
  @RequestMapping("/queryWebConfig")
  public JsonMessage queryWebConfig(TbConfigModel model) throws Exception {
    return tbconfigService.queryWebConfig(model);
  }

}
