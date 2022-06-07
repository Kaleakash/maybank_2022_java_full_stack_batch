package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Login;


public class LoginDao {					// Using JDBC or Hibernate 
	
	public int creteLoginDetails(Login login) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(login);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int checkLoginDetail(Login login) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Query qry = session.createQuery("select l from Login l where l.email =?1  and l.password = ?2");
			qry.setParameter(1, login.getEmail());
			qry.setParameter(2, login.getPassword());
			List list = qry.list();			
			return list.size();			// size is 1 or size 0
		
	}
}
