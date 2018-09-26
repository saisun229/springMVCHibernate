package springmvc_example.dao;




import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_example.model.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao {

 @Autowired
 private SessionFactory sessionFactory;

 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }
 
 @SuppressWarnings("unchecked")
 public List listAllCustomers() {
  Criteria criteria = getSession().createCriteria(Customer.class);
  return (List) criteria.list();
 }



}