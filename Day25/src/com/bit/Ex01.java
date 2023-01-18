package com.bit;

import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLError;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

public class Ex01 {

	public static void main(String[] args) {
		java.sql.Connection conn = null;
		com.mysql.jdbc.Driver driver;
		try {
			driver = new com.mysql.jdbc.Driver();
			System.out.println(driver);
			//3.5.2
			String url = "jdbc:mysql://localhost:3306/lecture";
			//
			java.util.Properties props = null;
			props = new java.util.Properties();
			props.setProperty("user", "scott"); //key = user 
			props.setProperty("password", "tiger");
			conn = java.sql.DriverManager.getConnection(url,props);
			
			String sql = "insert into dept (deptno,dname,loc)" + "values(50,'물류','부산')";
			//String sql = "update dept set dname = '전산' where dname ='물류' ";
			
			java.sql.Statement stmt = null;
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
				try {
					if(conn!=null)conn.close();
					
				}catch(SQLException e1) {
					e.printStackTrace();
				}
			e.printStackTrace();
		}

	}

}
