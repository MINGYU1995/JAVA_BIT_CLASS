package com.bit;

import java.sql.*;
import java.util.Map;

public class Ex01 {

   public static void main(String[] args) {
      String driver = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/lecture";
      Map<String, String> env = System.getenv();
      String user=env.get("local.mysql.user");
	  String password=env.get("local.mysql.password"); 	
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      int index = 4;
      int kor=3,eng=4,mat=5;
      
 
//      String update = "UPDATE student SET kor = " + kor+",";
//		update += "eng = " + eng +",";
//		update += "mat = " + mat;
//		update += " where stuNum = "+ index+";";
      String addTable2 = "create table Sum(";
      addTable2 += "name varchar(10),";
      addTable2 += "stuNum int,";
      addTable2 += "hap int,";
      addTable2 += "stuAvg float,";
      addTable2 += "hak varchar(2),";
      addTable2 += "allavg float);";

		//System.out.println(find);
      try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();	
			stmt.executeUpdate(addTable2);
		
			//stmt.executeUpdate(delete);
//			while(rs.next()) {
//					System.out.println(rs.getString(1) + "\t" + rs.getInt(2)+
//							"\t" + rs.getInt(3)+"\t" + rs.getInt(4)
//							+"\t" + rs.getInt(5));			
//			}
//			
			//stmt.executeUpdate(insert);
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
			
				if (stmt != null) { // 값이 들어가 있음
					stmt.close(); // statement 닫음
				}
				if (conn != null) { // 디비 연결되어 있음
					conn.close(); // connection닫아줌
				}			
			
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
      
      }
   }
}


