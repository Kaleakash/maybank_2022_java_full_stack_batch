package com;

public class Manager extends Employee{
	private int numberOfEmp;
	public void readMgr() {
		readEmp();				// id,name,salary, city and state, 
		System.out.println("Enter the emp of employee ");
		numberOfEmp = sc.nextInt();
	}
	public void disMgr() {
		disEmp();
		System.out.println("Number of emp is "+numberOfEmp);
	}
}
