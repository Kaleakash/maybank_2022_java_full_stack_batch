package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;



@Repository
public class ProductDao {

	@Autowired
	DataSource ds;			// pull the database connection from xml file 
	
	// pure Jdbc code 
	public int storeEmployee(Product product) {
		try {
			Connection con = ds.getConnection();			// we will the get the connection. 
			PreparedStatement pstm = con.prepareStatement("insert into product values(?,?,?)");
			pstm.setInt(1, product.getPid());
			pstm.setString(2, product.getPname());
			pstm.setFloat(3, product.getPrice());
			int res = pstm.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				listOfProduct.add(p);
			}
			return listOfProduct;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
