package top.leseul.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.leseul.supermarketonline.model.IndexModel;
import top.leseul.supermarketonline.service.IndexService;
import top.leseul.supermarketonline.utils.JsonMessage;

/**
 * -默认首页控制器
 *
 * @author leseul
 *
 */
@RestController
public class IndexController {
  @Autowired
  private IndexService indexService;

  @RequestMapping("")
  public JsonMessage index(IndexModel model) throws Exception {
    // {"echo":"测试"}
    JsonMessage message = indexService.index();
    message.put("echo", model.getEcho());
    return message;
  }
}
