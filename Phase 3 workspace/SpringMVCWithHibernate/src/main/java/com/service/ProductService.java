package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	
	public List<Product> getProductByCategory(String category){
		return productDao.getAllProductsByCategory(category);
	}
}
