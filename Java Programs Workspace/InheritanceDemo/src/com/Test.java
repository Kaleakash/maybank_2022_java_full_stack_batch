package com;
class A  extends B{
		void dis1() {
			System.out.println("A class dis1 method");
		}
}
class B {
	void dis2() {
		System.out.println("B class dis2 method");
	}
}
public class Test {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.dis1();
		obj1.dis2();
		B obj2 = new B();
		obj2.dis2();
		//obj2.dis1();
	}

}
