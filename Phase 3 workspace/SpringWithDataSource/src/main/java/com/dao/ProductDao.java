package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;



@Repository
public class ProductDao {

	@Autowired
	DataSource ds;			// pull the database connection from xml file 
	
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
}
