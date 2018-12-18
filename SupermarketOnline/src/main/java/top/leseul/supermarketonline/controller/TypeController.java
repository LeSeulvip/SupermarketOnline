package top.leseul.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.leseul.supermarketonline.model.TbTypeModel;
import top.leseul.supermarketonline.service.TypeService;
import top.leseul.supermarketonline.utils.JsonMessage;

@RestController
@RequestMapping("/type")
public class TypeController {
  @Autowired
  private TypeService typeService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbTypeModel model) throws Exception {
    // /type/queryAll
    return typeService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbTypeModel model) throws Exception {
    // /type/add?token=7f2b8770-4c84-4621-9ecc-6bd1069f6176&tbType.typeName=衣服&tbType.typeInfo=服装类别
    return typeService.add(model);
  }
  
  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbTypeModel model) throws Exception {
    // /type/queryByKey?token=7f2b8770-4c84-4621-9ecc-6bd1069f6176
    return typeService.queryByKey(model);
  }
  
  @RequestMapping("/delete")
  public JsonMessage delete(TbTypeModel model) throws Exception {
    // /type/delete?token=7f2b8770-4c84-4621-9ecc-6bd1069f6176
    return typeService.delete(model);
  }
  
  @RequestMapping("/modify")
  public JsonMessage modify(TbTypeModel model) throws Exception {
    // /type/modify?token=7f2b8770-4c84-4621-9ecc-6bd1069f6176
    return typeService.modify(model);
  }
  
}
