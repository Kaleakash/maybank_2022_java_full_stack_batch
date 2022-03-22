package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class HashSetDemo {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();
	LinkedHashSet hs = new LinkedHashSet();
	System.out.println("Size of "+hs.size());
		hs.add(10);
	hs.add(10.10);
	hs.add("Ravi");
		hs.add(10);		// 10 element present 
	hs.add(true);
	System.out.println("Size of "+hs.size());
	System.out.println("Search "+hs.contains(10));
	System.out.println("Search "+hs.contains(100));
	System.out.println(hs);
	System.out.println("Remove "+hs.remove(10));
	System.out.println("Remove "+hs.remove(100));
	System.out.println(hs);
	Iterator ii = hs.iterator();
	while(ii.hasNext()) {
		System.out.println(ii.next());
	}
	}
}
