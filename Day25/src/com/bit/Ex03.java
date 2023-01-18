package com.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Driver;


public class Ex03 {

	public static void main(String[] args) {
		//사번을 입력 받아서 emp의 empno,ename,sal을 출력하시오.
		System.out.print("사번을 입력하세요>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//db의 사번은 string -> int로 바꾸고 
		//입력받은 str도 -> int로 바꿔서 비교함.
		
		
		//String sql = "select empno,ename,sal from emp";
		  String sql = "SELECT empno,ename,sal FROM emp"; 
		  String sqlOutput = "SELECT empno from emp";
		  
		  
	      String url = "jdbc:mysql://localhost:3306/lecture";
	      Properties info = new Properties();
	      info.setProperty("user", "scott");
	      info.setProperty("password", "tiger");
	      Connection conn = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	      while(true) {
	      try {
	         Driver driver = new Driver();
	         conn = DriverManager.getConnection(url, info);
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery(sql);
	         
	   
	        	 if(input == sqlOutput) {	 
	        		 while(rs.next()) {
	        			 System.out.print(rs.getObject(1)+"\t");
	        			 System.out.print(rs.getObject(2)+"\t");
	        			 System.out.println(rs.getObject(3));
	        		 }
	        	  
	      }
	         
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (stmt != null)
	               stmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	}
}


