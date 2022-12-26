package com.bit;
import java.util.*;

class Student{
	String name;
	int stuNum,kor,eng,mat;
	
}
public class Ex22 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		boolean boo = true;
		
		System.out.println("학점계산기 ver 0.4.0");
		
		do {
			//CRUD 순으로
			System.out.println("0.종료/1.리스트/2.입력/3.삭제/4.상세이력/5.수정");
			int input = sc.nextInt();
			
			//리스트
			if(input == 1) {
				
			//입력
			}else if(input == 2) {
			
			
			//삭제
			}else if(input == 3) {
			
			//상세이력
			}else if(input == 4) {
			
			//수정
			}else if(input == 5) {
			
			//종료
			}else break;
			
			
			
			
			
		}while(boo);
		
			
		
	}

}
