package springmvc_example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc_example.dao.CustomerDao;
import springmvc_example.model.Customer;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
 
 CustomerDao customerDao;
 
 @Autowired
 public void setCustomerDao(CustomerDao customerDao) {
  this.customerDao = customerDao;
 }

 public List listAllCustomers() {
  return customerDao.listAllCustomers();
 }



}