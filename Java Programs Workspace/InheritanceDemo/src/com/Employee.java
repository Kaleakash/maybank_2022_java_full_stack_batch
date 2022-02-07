package com;

import java.util.Scanner;

public abstract class Employee {
		private int id;
		private String name;
		private float salary;
		Scanner sc = new Scanner(System.in);
		Address add = new Address();
		public void readEmp() {
			System.out.println("enter the id");
			id = sc.nextInt();
			System.out.println("enter the name");
			name = sc.next();
			System.out.println("enter the salary");
			salary = sc.nextFloat();
			add.readAdd();
		}
		public void disEmp() {
			System.out.println("Id is "+id);
			System.out.println("name is "+name);
			System.out.println("salary is "+salary);
			add.disAdd();
		}
}
