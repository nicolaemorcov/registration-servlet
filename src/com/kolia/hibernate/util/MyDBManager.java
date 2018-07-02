package com.kolia.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyDBManager {

	// creating config object
	Configuration cfg;
	
	// session factory is needed to create session
	SessionFactory sessionFactory;
	
	
	
	public MyDBManager() {
		initJPA();
	}

	public void initJPA() {
		readAndCreateConfigFile();
		createDBFactory();
	}
	
	public void readAndCreateConfigFile() {
		//get the configuration from hibernate.cfg.xml and create configuration object
		cfg = new Configuration().configure();
	}
	
	public void createDBFactory() {
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public SessionFactory getDBFactory() {
		return sessionFactory;
	}
}
