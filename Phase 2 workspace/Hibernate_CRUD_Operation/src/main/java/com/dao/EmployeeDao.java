package com.dao;


import org.hibernate.cfg.*;
import org.hibernate.*;

import com.entity.Employee;

public class EmployeeDao {

	
	public int storeEmployee(Employee emp) {
		try {
			Configuration con  = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();	// it like a connecton reference. 
			Session session = sf.openSession();			// it is like a Statement and PreparedStatement 
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(emp);				// it is like a insert query. we are saving the object directly. 
					
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
