package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(4);
		//ts.add("Ravi");
		ts.add(3);
		ts.add(1);
		ts.add(2);
		System.out.println("Add "+ts.add(5));
		System.out.println("Add "+ts.add(5));
		ts.add(7);
		System.out.println(ts);
		if(ts.size()<=5) {
			ts.add(6);
			System.out.println("Element added");
		}else {
			System.out.println("Element didn't add because size is full");
		}
	}

}
