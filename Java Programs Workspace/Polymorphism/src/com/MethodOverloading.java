package com;
class Operation {
		void add(int x, int y) {
			System.out.println(x+y);		
		}
		void add(int x, int y, int z) {
			System.out.println(x+y+z);
		}
		void add(float x, float y, float z) {
			System.out.println(x+y+z);
		}
		void add(int x, int y, int z, int a) {
			System.out.println(x+y+z+a);
		}
		void add(float a, float b) {
			System.out.println(a+b);
		}
		void add(String s1, String s2) {
			System.out.println(s1+s2);
		}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Operation op = new Operation();
		op.add(1.1f, 2.2f, 3.3f);
		op.add(1, 2);
		op.add("1", "2");
		op.add(10.10f, 20.20f);
	}

}
