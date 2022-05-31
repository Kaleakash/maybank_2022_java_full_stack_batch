package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Login;
public class LoginDao {
	
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
}
