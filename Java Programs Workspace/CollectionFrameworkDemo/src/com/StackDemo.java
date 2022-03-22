package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println("Items from stack "+ss);
		System.out.println("Remove top most element "+ss.pop());		// remove top most or last element 
		System.out.println("Items from a stack "+ss);
		System.out.println("Check top most element "+ss.peek());// check top most element 
		System.out.println("Items from a stack "+ss);
		System.out.println("Search "+ss.search(100));		// if present it will display position from top 
		System.out.println("Search "+ss.search(1000));	// if not present it will return -1
	}
}
