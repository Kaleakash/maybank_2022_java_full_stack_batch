package com;

public class InheritanceTest {

	public static void main(String[] args) {
//	Employee emp = new Employee();
//	emp.readEmp();
//	emp.disEmp();
		//Employee emp = new Employee();
		Manager mgr = new Manager();
		System.out.println("Enter Manager Details");
		mgr.readMgr();
		Developer dev = new Developer();
		System.out.println("Enter Developer Details");
		dev.readDev();
		ProjectManager pm = new ProjectManager();
		System.out.println("Enter Project Manager Details");
		pm.readPMgr();
		System.out.println("Manager Details");
		mgr.disMgr();
		System.out.println("Developer Details");
		dev.disDev();
		System.out.println("Project Manager Details");
		pm.disPMgr();
	}

}
