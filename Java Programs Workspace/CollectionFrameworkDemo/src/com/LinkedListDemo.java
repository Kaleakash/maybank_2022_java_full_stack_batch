package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();		// double linked list 
		ll.add(10);			// node created 
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1, 100);
	}

}
