package com.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;
import com.dao.ProductDaoJdbcTemplate;

@Service						// id is productService
public class ProductService {

	@Autowired
	ProductDao productDao;					// pull the object from container. 
	
	
	@Autowired
	ProductDaoJdbcTemplate productDaoJdbcTemplate;			// di for ProductDaoJdbcTemplate 
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(productDao.storeEmployee(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public String storeProductUsingJdbcTemplate(Product product) {
		if(productDaoJdbcTemplate.storeProduct(product)>0) {
			return "Product Details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
	
	public List<Product> getAllProductUsingJdbcTemplate() {
		return productDaoJdbcTemplate.getAllProduct();
	}
}
