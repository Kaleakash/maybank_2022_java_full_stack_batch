package com.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service						// id is productService
public class ProductService {

	@Autowired
	ProductDao productDao;					// pull the object from container. 
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(productDao.storeEmployee(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
}
