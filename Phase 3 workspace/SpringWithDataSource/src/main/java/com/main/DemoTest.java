package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.sevice.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	// object is ready using DI 
	ProductService ps = (ProductService)ac.getBean("productService");		// pull the object of service 
	Product p = (Product)ac.getBean("product");								// pull the object of bean 
	p.setPid(100);
	p.setPname("Tv");
	p.setPrice(58000);
	String result = ps.storeProduct(p);
	System.out.println(result);
	}

}
