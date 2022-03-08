package com;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		try {
		int res = a/b;
		System.out.println("Result is "+res);
		int res1 = 10/abc[2];
		System.out.println("Result is "+res1);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			System.out.println(e);
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}
}
