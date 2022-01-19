package com;

public class TypeCastingExample {

	public static void main(String[] args) {
		byte a=10;				// -128 to 127
		short b =a;			// implicit type casting 
		
		short c = 129;
		byte d = (byte)c;		// explicit type casting 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int e=10;
		float f = e;			// implicit type casting 
		
		//float g = 10;
		//float g = (float)10.10;		// explicit type casting 
		float g = 10.10f;					// explicit type casting 
		int h = (int)g;			// explicit type casting 
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}

}
