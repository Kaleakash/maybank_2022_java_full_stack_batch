package com;

public class ThrowsKeywordExample {
	static void display1() throws NumberFormatException{
		try {
		  //int a=10/0;
			String str ="10a";
			int res = Integer.parseInt(str);
		}catch(ArithmeticException e) {}
		System.out.println("This is display1 method");
	}
	static void display2() throws NullPointerException{
		try {
		display1();
		}catch(NumberFormatException e) {}
		System.out.println("This is display2 method");
	}
	public static void main(String[] args) {
		try {
		display2();
		}catch(Exception e) {}
		System.out.println("This is main method");
	}

}
