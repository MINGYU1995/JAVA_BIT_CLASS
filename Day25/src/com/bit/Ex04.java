package com.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번?");
		String sql = "select empno, ename,sal from emp where empno = " + sc.nextInt();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	    String url = "jdbc:mysql://localhost:3306/lecture";
	    Properties info = new Properties();
	    info.setProperty("user", "scott");
	    info.setProperty("password", "tiger");
	    
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection(url,info);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);	
			 if(rs.next()) { 
		            System.out.print(rs.getObject(1)+"\t");
		            System.out.print(rs.getObject(2)+"\t");
		            System.out.println(rs.getObject(3)+"\n");
		         }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
