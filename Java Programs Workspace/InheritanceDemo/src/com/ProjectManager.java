package com;

public class ProjectManager extends Manager{
		private int numberOfProjects;
		public void readPMgr() {
				readMgr();
				System.out.println("enter the number of projects");
				numberOfProjects = sc.nextInt();
		}
		public void disPMgr() {
			disMgr();
			System.out.println("Number of projects "+numberOfProjects);
		}
}
