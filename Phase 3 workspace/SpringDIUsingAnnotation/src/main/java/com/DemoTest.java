package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
	
//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//Employee emp = (Employee)ac.getBean("employee");
//
//System.out.println(emp);			// if we dislay reference in println it will call automatically toString
////System.out.println(emp.getId());
////System.out.println(emp.getName());
////System.out.println(emp.getSalary());
//emp.setId(100);
//emp.setName("Ravi Kumar");
//emp.setSalary(34000);
//System.out.println(emp);

AnnotationConfigApplicationContext  ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
Employee emp = (Employee)ac.getBean("employee");
System.out.println(emp);
	}

}
