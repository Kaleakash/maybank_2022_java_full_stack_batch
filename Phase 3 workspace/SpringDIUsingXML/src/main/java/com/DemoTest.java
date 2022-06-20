package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.displayEmployee();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = ac.getBean("emp1");
		emp1.displayEmployee();
	}

}
