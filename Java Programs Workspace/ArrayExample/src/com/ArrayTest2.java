package com;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names do you want to store?");
		int n = sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter the name one by one");
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		System.out.println("Names are ");
		for(int i=0;i<n;i++) {
			System.out.println(names[i]);
		}
	}
}
