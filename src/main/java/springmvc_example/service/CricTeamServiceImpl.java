package springmvc_example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc_example.dao.CricTeamDao;
import springmvc_example.dao.CustomerDao;


@Service
@Transactional
public class CricTeamServiceImpl  implements CricTeamService {
 
 CricTeamDao cricTeamDao;
 
 @Autowired
 public void setCustomerDao(CricTeamDao cricTeamDao) {
  this.cricTeamDao = cricTeamDao;
 }

 public List listAllCricTeams() {
  return cricTeamDao.listAllCricTeams();
 }


}
