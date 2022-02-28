package com;
class A {
		int x=100;
}
class B extends A {
	int x=200;
	void dis() {
			int x=300;
			System.out.println("X is "+x);			// 300
			System.out.println("Instance variable "+this.x);		// 200
			System.out.println("Super variable "+super.x);      // 100
	}
}
public class DemoTest {
	public static void main(String[] args) {
	B obj1 = new B();
	obj1.dis();
	}
}
