package com;

import java.util.ArrayList;

public class EmloyeeService {

	public static void main(String[] args) {
		// Collection Framework with Java bean class. 
		ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(14000);
		
		Employee emp2 = new Employee(101, "Ajay", 15000);
		
		Employee emp3 = new Employee(102, "Mahesh", 16000);
		
		System.out.println("Number of employee "+listOfEmp.size());   // zero
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		System.out.println("Number of employee "+listOfEmp.size());   // 3
		listOfEmp.remove(1);
		System.out.println("Number of employees "+listOfEmp.size());
	}
	

}
