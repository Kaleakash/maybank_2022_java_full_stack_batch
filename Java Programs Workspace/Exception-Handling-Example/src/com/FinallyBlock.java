package com;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a=10/1;
			System.out.println("No Exception");
		} catch (Exception e) {
			System.out.println("Catch block");
		} finally {
			System.out.println("Finally block");
		}
	}

}
