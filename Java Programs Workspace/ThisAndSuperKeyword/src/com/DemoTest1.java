package com;
class Employee {
	Employee() {
		//this(100);		// calling one parameter constructor 
		System.out.println("Empty constructor");
	}
	Employee(int id){
		this(100,"Ravi");
		System.out.println("One parameter");
	}
	Employee(int id, String name){
		this();
		System.out.println("Two parameter");
	}
}
public class DemoTest1 {
	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		Employee emp2 = new Employee(100);
		//Employee emp3 = new Employee(101, "Ramesh");
	}

}
