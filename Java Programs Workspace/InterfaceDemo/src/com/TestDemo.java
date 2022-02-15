package com;
interface Abc {
	int a=10;
	void dis1();
}
interface Mno {
	int b=20;
	void dis2();
}
interface Xyz extends Abc,Mno{		// multiple inheritance. 
	int c=30;
	void dis3();
}
class Test implements Xyz{
		public void dis1() {
			System.out.println("Abc interface method");
		}
		public void dis2() {
			System.out.println("Mno interface method");
		}
		public void dis3() {
			System.out.println("Xyz interface method");
		}
}
public class TestDemo {
	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis1();
		tt.dis2();
		tt.dis3();
	}

}
