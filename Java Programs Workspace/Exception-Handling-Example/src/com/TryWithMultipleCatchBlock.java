package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int res[]= {10,20,30,40};
		String str = "a10";
		try {
			int a=10/1;
			int abc = res[2];
			int res1 = Integer.parseInt(str);			// convert string to integer 
			System.out.println(res1+100);
		}catch (ArithmeticException e) {
		// coding...
			System.out.println("Divided by zero "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index "+e);
		}catch(Exception e) {
			System.out.println("Generic "+e);
		}
		System.out.println("Finish");
	}

}
