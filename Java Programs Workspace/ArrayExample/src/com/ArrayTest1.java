package com;

public class ArrayTest1 {

	public static void main(String[] args) {
		int num[]=new int[10];
		int leng = num.length;
		System.out.println("Size of array "+leng);
		System.out.println("0 index position "+num[0]);
		System.out.println("1 index position "+num[1]);
		num[0]=100;
		num[1]=200;
		System.out.println("0 index position "+num[0]);
		System.out.println("1 index position "+num[1]);
		int temp =100;
		for(int i=0;i<num.length;i++) {
			num[i]=temp;
			temp = temp +100;
		}
		System.out.println("Display array value");
		for(int n:num) {
			System.out.println("Value is "+n);
		}
	}

}
