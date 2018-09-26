package springmvc_example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc_example.service.CricTeamService;



@Controller
@RequestMapping(value="/team")
public class CricTeamController {

 @Autowired
 CricTeamService cricTeamService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list(){
  ModelAndView model = new ModelAndView("team/list");
  List list = cricTeamService.listAllCricTeams();
  model.addObject("list", list);
  
  return model;
 }
 
}