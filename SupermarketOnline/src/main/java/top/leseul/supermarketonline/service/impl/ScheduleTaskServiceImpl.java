package top.leseul.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.leseul.supermarketonline.dao.TbTokenDAO;
import top.leseul.supermarketonline.dao.TbTokenInfoDAO;
import top.leseul.supermarketonline.service.ScheduleTaskService;

/**
 *
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ScheduleTaskServiceImpl implements ScheduleTaskService {
  @Autowired
  private TbTokenDAO tbTokenDAO;
  @Autowired
  private TbTokenInfoDAO tbTokenInfoDAO;

  @Override
  public int deleteTokens() throws Exception {
    tbTokenInfoDAO.deleteTokenInfos();
    return tbTokenDAO.deleteTokens();
  }

}
