package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.entity.User;


@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		//return sessionFactory.openSession();
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void registerCustomer(User user) {
		Session session = getSession();
		session.save(user);
	}

}
