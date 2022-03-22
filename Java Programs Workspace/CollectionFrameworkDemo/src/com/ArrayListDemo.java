package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Size of array "+al.size());
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(400);
		al.add(400);
		al.add(500);
		System.out.println("Size of array "+al.size());
		System.out.println("retrieve the element using index position "+al.get(0));
		System.out.println("retrieve the element using index position "+al.get(1));
		al.add(1, 10);		// adding 10 element in 1 position 
		System.out.println("Size of array "+al.size());
		System.out.println("retrieve the element using index position "+al.get(1));
		System.out.println("retrieve the element using index position "+al.get(2));
		al.remove(3);		// remove using index position 
		al.remove(new Integer(400));
		System.out.println("Size of array "+al.size());
		Iterator ii = al.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
	}	

}
