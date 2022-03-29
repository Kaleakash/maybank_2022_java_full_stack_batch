package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoTest {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/maybank?useSSL=false", "root", "root@123");
			System.out.println("connected successfully..");
PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, 6);
		pstmt.setString(2, "Balaji");
		pstmt.setFloat(3, 34000);
		
		int res = pstmt.executeUpdate();		// Insert the record
		if(res>0) {
			System.out.println("Record inserted successfully...");
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
