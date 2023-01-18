package com.bit;

import java.sql.*;
import java.util.Map;

public class Ex01 {

   public static void main(String[] args) {
      String driver = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/lecture";
      Map<String, String> env = System.getenv();
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      
      String sql = "select empno,ename,";
      sql +="(select dname from dept b where b.deptno = a.deptno),";
      sql += "(select loc from dept b where b.deptno=a.deptno)";
      sql += "from emp a where deptno is not null";
      
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, env.get("local.mysql.user"), env.get("local.mysql.password"));
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);

         while (rs.next()) {
            System.out.print(rs.getString(1) + "\t");
            System.out.print(rs.getString(2) + "\t");
            if (rs.getString(3).length() < 6) {
               System.out.print(rs.getString(3) + "\t\t");
            } else {
               System.out.print(rs.getString(3) + "\t");
            }
            System.out.print(rs.getString(4) + "\n");
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

}
