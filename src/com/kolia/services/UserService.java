package com.kolia.services;

import org.hibernate.Session;

import com.kolia.entities.User;
import com.kolia.hibernate.util.MyDBManager;

public class UserService {

	MyDBManager dbManager = new MyDBManager();
	
	public void registerUser(User user) {
		Session session = dbManager.getDBFactory().openSession();
		session.beginTransaction();
		
		session.persist(user);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
}
