package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import top.leseul.supermarketonline.dao.TbLogsDAO;
import top.leseul.supermarketonline.entity.TbLogs;
import top.leseul.supermarketonline.model.LogsModel;
import top.leseul.supermarketonline.service.LogsService;
import top.leseul.supermarketonline.utils.JsonMessage;
import top.leseul.supermarketonline.utils.PageBean;

/**
 * LogsService的实现
 * 
 * @author LeSeul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LogsServiceImpl implements LogsService {
  @Autowired
  private TbLogsDAO tbLogsDAO;

  @Override
  public JsonMessage queryAll(LogsModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbLogs> list = (Page<TbLogs>) tbLogsDAO.queryAll(model.getTbLogs());
    page.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("page", page);
    message.put("list", list);
    return message;
  }

}