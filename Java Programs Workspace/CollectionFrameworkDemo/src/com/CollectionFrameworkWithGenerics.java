package com;

import java.util.ArrayList;

public class CollectionFrameworkWithGenerics {

	public static void main(String[] args) {
	// Collection Framework without generics 
//	ArrayList al = new ArrayList();
//	al.add(10);		// auto-boxing : converting primitive to object. 
//	al.add(10.10);
//	al.add("Ravi");
//	al.add(true);
//	
//	Object obj	=	al.get(2);			// we got the object 
//	Integer i = (Integer)obj;			// type casting 
//	int n = i.intValue();					// integer object to primitive 
//	System.out.println(n);
		// Collection framework with generics. 
		ArrayList<Integer> al  = new ArrayList<Integer>();		// we can store only integer 
		al.add(10);
		al.add(20);
		al.add(30);
		//al.add(10.20);
		//al.add("Ravi");
		
		int n = al.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
