package com;

import java.util.Scanner;
//import java.lang.String;			// by default imported 
//import java.util.LinkedList;
//import java.util.*;				// add classes and interfaces part of util package. 

public class RuntimeValue {
	public static void main(String[] args) {
	//	LinkedList ll = new LinkedList();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id ");
		int id = obj.nextInt();			// scan or take the value through keyboards. 
		System.out.println("Enter the name");
		String name = obj.next();			// scan string value
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();
		System.out.println("Id is  "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		
	}

}
