package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the id");
	int id = sc.nextInt();
	System.out.println("enter the name");
	String name = sc.next();
	System.out.println("enter the salary");
	float salary = sc.nextFloat();
	Employee emp = new Employee();
	emp.setId(id);
	emp.setName(name);
	emp.setSalary(salary);
	EmployeeService es = new EmployeeService();
	String res = es.storeEmployee(emp);
	System.out.println(res);
	}

}
