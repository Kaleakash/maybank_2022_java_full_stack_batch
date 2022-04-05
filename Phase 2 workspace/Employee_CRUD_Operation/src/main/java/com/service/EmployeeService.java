package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else {
			if(ed.insertEmployee(emp)>0) {
				return "REcord inserted ";
			}else {
				return "Record didn't insert";
			}
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String deleteEmloyee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
}
