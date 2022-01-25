package com;

class Abc {
		Abc() {
				System.out.println("Consructor example");
		}
		void display() {
			System.out.println("Display method");
		}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Abc obj1 =new Abc();
		//obj1.display();
	}
}
