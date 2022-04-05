package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bean.Employee;

public class EmployeeDao {

	public int insertEmployee(Employee emp) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/maybank?useSSL=false", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
pstmt.setInt(1, emp.getId());
pstmt.setString(2, emp.getName());
pstmt.setFloat(3, emp.getSalary());
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateEmployee(Employee emp) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/maybank?useSSL=false", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("update employee set salary =? where id =?");
pstmt.setFloat(1, emp.getSalary());
pstmt.setInt(2, emp.getId());
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteEmployee(int id) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/maybank?useSSL=false", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
pstmt.setInt(1, id);
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}