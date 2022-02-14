package com;
class Abc {
			int a;				// instance variable 
			static int b;		// static variable 
			void dis1() {
				System.out.println("Non static or instance method");
				System.out.println("a "+a);
				System.out.println("b "+b);
			}
			static void dis2() {
				System.out.println("Static method");
				Abc obj = new Abc();
				System.out.println("a "+obj.a);
				System.out.println("b "+b);
			}
}
public class Test {
	public static void main(String[] args) {
		Abc.dis2();
		Abc obj = new Abc();
		System.out.println(obj.a);					// through object 
//		System.out.println(Abc.b);					// through class name
//		System.out.println(obj.b);                // through object static variable 
//		obj.dis1();      // calling non static method 
//		Abc.dis2();     // calling static method 
//		obj.dis2();    // calling static method through object. 
	}
}
