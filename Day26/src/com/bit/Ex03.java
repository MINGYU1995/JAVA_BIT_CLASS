package com.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Ex03 {
//1.emp 2.dept 0.exit>1
//1
//1.list 1.insert 3.update(add Deptno) 4.delete>~
//2
//1.list 2.insert 3.delete>~~	
	public static void main(String[] args) {
		int tableInput;
		int dmlInput;
		String msg = "";
		String dml = "";
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/lecture";
		Map<String, String> env = System.getenv();
		Properties info = new Properties();
		info.setProperty("user", env.get("local.mysql.user"));
		info.setProperty("password", env.get("local.mysql.password"));
		System.out.print("1.emp 2.dept 0.exit>");
		tableInput = sc.nextInt();
		while(true) {
		Scanner sc1 = new Scanner(System.in);
		if(tableInput == 1) msg = "emp";
		else if(tableInput == 2) msg ="dept";
		
		System.out.print("1.list 2.insert 3.delete 4.exit>");
		dmlInput = sc.nextInt();
		if(dmlInput == 1) {
			dml = "select * from " + msg; 
			System.out.println(dml);
		}else if(dmlInput == 2) {
			System.out.print("사번>");
			int num = Integer.parseInt(sc1.nextLine());
			System.out.print("이름>");
			String name=sc1.nextLine();
			System.out.print("금액>");
			int sal=Integer.parseInt(sc1.nextLine());
			System.out.println("커미션>");
			int comm=Integer.parseInt(sc1.nextLine());
			dml ="INSERT INTO "+ msg +" (empno, ename, hiredate, sal, comm) ";
			dml +="VALUES ("+num+", '"+name+"', now(), "+sal+", "+comm+")";
			System.out.println(dml);
			
		}else if(dmlInput == 3) {
			dml = "delete from" + msg;
		}else if(dmlInput == 0)break;	
		}
		Connection conn = null;
		
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			stmt.executeUpdate(dml);
			System.out.println("입력되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}

