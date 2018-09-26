package springmvc_example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_example.model.CricTeam;




@Repository
public class CricTeamDaoImpl implements CricTeamDao {

 @Autowired
 private SessionFactory sessionFactory;

 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }
 

 public List listAllCricTeams() {
  Criteria criteria = getSession().createCriteria(CricTeam.class);
 
  return (List) criteria.list();
 }

 



}




/* 
public CricTeam findCricTeamById(int id) {
	  CricTeam cricTeam = (cricTeam) getSession().get(CricTeam.class, id);
	  return cricTeam;
	 }*/











/*
@SuppressWarnings("unchecked")*/