package springmvc_example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc_example.model.Customer;
import springmvc_example.service.CustomerService;



@Controller
@RequestMapping(value="/customer")
public class CustomerController {

 @Autowired
 CustomerService customerService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list(){
  ModelAndView model = new ModelAndView("customer/list");
  List list = customerService.listAllCustomers();
  model.addObject("list", list);
  
  return model;
 }
 
}