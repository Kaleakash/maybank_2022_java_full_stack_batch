package com;

public class TryWithFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a=10/0;
			System.out.println("No Exception");
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Normal Statement");
	}

}
