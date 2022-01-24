package com;

public class ArrayTest {

	public static void main(String[] args) {
		int a=10;
		int abc[];	
		int num[]= {10,20,30,40,50,60,55,66,45,36,89,78,65,34,78,90};
		String[] names= {"Ravi","Raj","Ajay","Vijay"};
		System.out.println(num);
		System.out.println(a);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[5]);
		int leng = num.length;
		System.out.println("Size of the array is "+leng);
		System.out.println("using for loop");
		for(int i=4;i<10;i=i+2) {
				System.out.println(num[i]);
		}
		System.out.println(" enhanced loop");
		for(int n : num) {
				System.out.println(n);
		}
		System.out.println("All names");
		for(String name : names) {
			System.out.println(name);
		}
	}

}
