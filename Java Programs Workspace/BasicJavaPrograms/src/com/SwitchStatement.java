package com;

public class SwitchStatement {

	public static void main(String[] args) {
		int label=10;
		switch (label) {
		case 1:	System.out.println("block1");
					break;
		case 2: System.out.println("block 2");		
					break;
		case 3:System.out.println("block 3");
		           break;
		default:System.out.println("Wrong choice");
					break;
		}
		System.out.println("Finish");
	}

}
