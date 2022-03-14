package com;
class AgeException extends Exception {
		public AgeException() {
		
		}
		AgeException(String str){
						super(str);			// calling Exception super class parameter constructor to set the messasge 
		}
}
public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age =-15;
		try {
				if(age<21) {
					//throw new Exception();		// Generic Exception 
					//throw new ArithmeticException();	// specific exception 
					//int a=10/0;
					//throw new ArithmeticException("age must be > 21");
					//throw new AgeException();					// default constructor 
					throw new AgeException("age must be > 21");	// it call parameter constructor 
				}
		} catch (Exception e) {
			System.out.println(e);	
		}
		System.out.println("Normal Statement");
	}

}
