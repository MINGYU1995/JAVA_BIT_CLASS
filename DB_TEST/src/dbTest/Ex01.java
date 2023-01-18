package dbTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

class Student {
	String name;
	int kor,eng,mat,stuNum;
}

//학생성적관리 프로그램? 
//1.리스트,2.입력,3.삭제,4.수정,0.종료 ,5.저장 ,6.수정(저장),7,삭제(저장)
public class Ex01 {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/lecture";
	    Map<String, String> env = System.getenv();
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    String addTable = "create table Student("
	    		+ "name varchar(5),"
	    		+ "stuNum int,"
	    		+ "kor int,"
	    		+ "eng int,"
	    		+ "mat int);";
	    
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램");
		
		while(true) {
			Student stu = new Student();
			Scanner sc2 = new Scanner(System.in);
			System.out.print("1.리스트,2.입력,3.삭제,4.수정 ,5.저장 ,6.수정(저장),7,삭제(저장), 0.종료>");
			int input = sc.nextInt();
			
			//리스트
			if(input == 1) {				
				System.out.println("이름\t학번\t국어\t영어\t수학");
				for (int i = 0; i < list.size(); i++) {
					stu = list.get(i);
					System.out.println(stu.name+"\t"+stu.stuNum+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.mat);
				}
				
			}
			//입력
			if(input == 2) {
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
			
				
			}
			//삭제
			if(input == 3) {
				
			}
			//수정
			if(input == 4) {
				
			}
			//저장 
			//테이블 생성 .. 
			if(input == 5) {
				for (int i = 0; i < list.size(); i++) {
					stu = list.get(i);
					String insert = "insert into (name,stuNum,kor,eng,mat) values("+stu.name+","+
							+stu.stuNum+","
							+stu.kor+","
							+stu.eng+","
							+stu.mat+")";
				}
				
				
			}	
			//수정(저장)
			if(input == 6) {
				
			}
			//삭제(저장)
			if(input == 7) {
				
			}//완전종료
			if(input == 0) {
				
			}
			
		}
		
		
		
	}

}
