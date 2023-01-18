package com.bit;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.mysql.jdbc.Driver;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> env = System.getenv();
		Set keys = env.keySet();
		keys.iterator();
		Iterator<String> ite = keys.iterator();
		while()
		System.out.println(env.get("local.mysql.user"));
		System.out.println(env.get("local.mysql.password"));
		
		String sql = "select empno,ename,hiredate,sal";
		sql+="sal+ifnull(comm,0) as money";
		sql+="from emp";
		String url = "jdbc:mysql://localhost:3306/lecture";
		Properties info = new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);		
			while(rs.next()) {
				System.out.print(rs.getNString(1)+"\t");
				System.out.print(rs.getNString(2)+"\t");
				System.out.print(rs.getNString(3)+"\t");
				System.out.print(rs.getNString(4)+"\t");
			}
		} catch (SQLException e) {
			System.out.println("쿼리문 실행");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)conn.close();
				if(stmt!=null)conn.close();
				if(conn!=null)conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				
			}
		}	
	}
}
