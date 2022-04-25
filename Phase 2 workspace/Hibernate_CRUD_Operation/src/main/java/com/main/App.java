package com.main;

import java.util.Scanner;

import com.entity.Employee;
import com.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		int id;
		String name;
		float salary;
		String con="";
		int choice;
		String res;
		do {
			System.out.println("1: Add Employee ");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Enter the id");
			         id = sc.nextInt();
			         System.out.println("Enter the name");
			         name = sc.next();
			         System.out.println("Enter the salary");
			         salary = sc.nextFloat();
			         Employee e1 = new Employee(id, name, salary);
			         res = es.storeEmployee(e1);
			         System.out.println(res);
				break;

			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue (y/n)");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You!");
	}

}
