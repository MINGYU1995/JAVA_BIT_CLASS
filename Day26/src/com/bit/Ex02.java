package com.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/lecture";
		Map<String, String> env = System.getenv();
		Properties info = new Properties();
		info.setProperty("user", env.get("local.mysql.user"));
		info.setProperty("password", env.get("local.mysql.password"));
		
		System.out.print("사번>");
		int num=Integer.parseInt(sc.nextLine());
		System.out.print("이름>");
		String name=sc.nextLine();
		System.out.print("금액>");
		int sal=Integer.parseInt(sc.nextLine());
		System.out.println("커미션>");
		int comm=Integer.parseInt(sc.nextLine());
		String sql="INSERT INTO emp (empno, ename, hiredate, sal, comm) ";
		sql+="VALUES ("+num+", '"+name+"', now(), "+sal+", "+comm+")";
		
		System.out.println(sql);
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("입력되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
