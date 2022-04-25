package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(ed.storeEmployee(emp) >0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
}
