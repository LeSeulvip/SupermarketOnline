package top.leseul.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.leseul.supermarketonline.base.BaseAdminUserController;
import top.leseul.supermarketonline.model.LogsModel;
import top.leseul.supermarketonline.service.LogsService;
import top.leseul.supermarketonline.utils.JsonMessage;

@RestController
@RequestMapping("/logs")
public class LogsController extends BaseAdminUserController {

  @Autowired
  private LogsService logsService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(LogsModel model) throws Exception {
    return logsService.queryAll(model);
  }
}
