package com;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/maybank?useSSL=false", "root", "root@123");
			System.out.println("connected successfully..");
// 		Insert query 	
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		pstmt.setInt(1, 6);
//		pstmt.setString(2, "Balaji");
//		pstmt.setFloat(3, 34000);
//		int res = pstmt.executeUpdate();		// DML (Insert, Delete and Update)
//		if(res>0) {
//			System.out.println("Record inserted successfully...");
//		}
		
// 		Delete Query 
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id =?");
//		pstmt.setInt(1, 2);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted..");
//		}else {
//			System.out.println("Record not present");
//		}
			
		// update query 
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id =?");
//		pstmt.setFloat(1, 34000);
//		pstmt.setInt(2, 1);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record updated..");
//		}else {
//			System.out.println("Record not present");
//		}
		// Retreive query 
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs =pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(" Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
