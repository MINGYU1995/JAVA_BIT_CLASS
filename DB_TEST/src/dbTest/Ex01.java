package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student {
	String name;
	int kor,eng,mat,stuNum;
}

//학생성적관리 프로그램? 
//1.리스트,2.입력,3.삭제,4.수정,0.종료 ,5.저장 ,6.수정(저장),7,삭제(저장)
public class Ex01 {
	
	static int firCnt = 0;
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/lecture";
	    Map<String, String> env = System.getenv();
	    String user=env.get("local.mysql.user");
		String password=env.get("local.mysql.password"); 	
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    
	    
		//ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램");
		
		while(true) {
			//1.리스트2.보기3.입력4.수정5.삭제 0.종료
			Scanner sc2 = new Scanner(System.in);
			System.out.print("1.리스트,2.보기,3.입력,4.수정 ,5.삭제 ,0.종료>");
			int input = sc.nextInt();
			
			//리스트
			if(input == 1) {
				String select ="select * from student";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);

					stmt = conn.createStatement();
					rs = stmt.executeQuery(select);
					System.out.println("이름\t학번\t국어\t영어\t수학");
					while(rs.next()) {
						
						System.out.println(rs.getString(1) + "\t" + rs.getInt(2)+
								"\t" + rs.getInt(3)+"\t" + rs.getInt(4)
								+"\t" + rs.getInt(5));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						rs.close();
						conn.close();
						stmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
			//보기 학점 평균 까지 
			if(input == 2) {
				//학번 입력받아서 해당 컬럼 조회.
				Student stu = new Student();
				System.out.println("학번을 입력하세요>");
				int stuNum = sc2.nextInt();
			    String search = "select * from temp where stuNum = "+ stuNum;

			    try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();	
					
					rs = stmt.executeQuery(search);
					System.out.println("학번\t합계\t평균\t학점\t전체평균\t");
					while(rs.next()) {
							System.out.println(rs.getString(1) + "\t" + rs.getInt(2)+
									"\t" + rs.getInt(3)+"\t" + rs.getInt(4)
									+"\t" + rs.getInt(5));	
							
					}
					
					//stmt.executeUpdate(insert);
					
				}catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						
						if(rs != null) {
							rs.close();
						}
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
//				String sql ="insert into tmp(name,stuNum,hap,stuAvg,hak,allavg) values('"+stu.name+"','"+
//						+sum+"','"
//						+avg+"','"
//						+score+"','"
//						+allStudentAvg+"')";
	
				
} //2번 끝 
				
	
			//입력
			if(input == 3) {
				Student stu = new Student();
				System.out.print("이름>");
				stu.name = sc2.nextLine();
				
				System.out.print("학번>");
				stu.stuNum = sc.nextInt();
				
				System.out.print("국어>");
				stu.kor = sc.nextInt();
						
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				
				System.out.print("수학>");
				stu.mat = sc.nextInt();	
				
				list.add(stu);
				
				//2. 계정연결	
			    
			    
	      String addTable = "create table Student(";
	      addTable += "name varchar(10),";
	      addTable += "stuNum int,";
	      addTable += "kor int,";
	      addTable += "eng int,";
	      addTable += "mat int);";
	     //System.out.println("학번\\t합계\\t평균\\t학점\\t전체평균\\t"); 
	      //상세보기 테이블을 따로 만듬.
	      String addTable2 = "create table temp(";
	      addTable2 += "name varchar(10),";
	      addTable2 += "stuNum int,";
	      addTable2 += "sum int,";
	      addTable2 += "avg float,";
	      addTable2 += "hak varchar(2),";
	      addTable2 += "allavg float);";
		  
			for (int i = 0; i < list.size(); i++) {
				stu = (Student) list.get(i);
				String tabCnt = "select count(*) from student;";
			    String insert = "insert into student(name,stuNum,kor,eng,mat) values('"+stu.name+"','"+
						+stu.stuNum+"','"
						+stu.kor+"','"
						+stu.eng+"','"
						+stu.mat+"')";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);

					stmt = conn.createStatement();
					
					if(addTable.isEmpty()) {
						stmt.executeUpdate(addTable);
						stmt.executeUpdate(addTable2);
					}
					//stmt.executeUpdate(sql);
					stmt.executeUpdate(insert);
					
				}catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						
					if(i==list.size()) {
						if (stmt != null) { // 값이 들어가 있음
							stmt.close(); // statement 닫음
						}
						if (conn != null) { // 디비 연결되어 있음
							conn.close(); // connection닫아줌
						}			
					}
						
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
					// 이클립스는 자동커밋이라 데이터가 자동으로 저장된다.
				}
			}
			
			}
			//수정
			if(input == 4) {
				//학번 입력받아서 수정.
			//	String update = "UPDATE student SET kor = " + 변수;				
				Student stu = new Student();
				
				System.out.print("수정할 학번을 입력하세요 ");
				int stuNum = sc2.nextInt();

				System.out.print("국어의 성적은?");
				stu.kor = sc.nextInt();
				System.out.print("영어의 성적은?");
				stu.eng = sc.nextInt();
				System.out.print("수학의 성적은?");
				stu.mat = sc.nextInt();
				
			    String update = "UPDATE student SET kor = " +stu.kor +",";
							update += "eng = " + stu.eng +",";
							update += "mat = " + stu.mat;
							update += " where stuNum = "+ stuNum +";";
							
						    try {
								Class.forName(driver);
								conn = DriverManager.getConnection(url, user, password);
								stmt = conn.createStatement();		
								stmt.executeUpdate(update);				
							}catch (SQLException e) {
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}finally {
								try {
									
									if(rs != null) {
										rs.close();
									}
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
			//테이블 삭제
			if(input == 5) {
				System.out.print("삭제할 학번을 입력하세요>");
				int stuNum = sc2.nextInt();
	
				String delete = "DELETE FROM student WHERE stuNum = ";
				delete += stuNum+";";
				 try {
						Class.forName(driver);
						conn = DriverManager.getConnection(url, user, password);
						stmt = conn.createStatement();		
						stmt.executeUpdate(delete);				
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
			//종료 
			if(input == 0) {
				System.out.println("수고");
				break;
			}
			
		}
			
} //main끝

}





