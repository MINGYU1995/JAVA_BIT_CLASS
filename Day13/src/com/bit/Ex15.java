package com.bit;
import java.util.*;

class Student{
	int kor,eng,mat,stuNum;
	
}

public class Ex15 {
//CRUD 순으로 기능을 적용한다. 
//list 는 순서를 위해 사용한다.	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 계산기 (ver 0.3.0)");
		boolean boo = true;
		
		while(boo) {
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 5.상세이력 0.종료>");
			int input = sc.nextInt();
			
			// 1. 리스트
			if(input == 1) {
				System.out.println("학번\t 국어\t 영어\t 수학\t");
				for (int i = 0; i < list.size(); i++) {
					Student stu = (Student) list.get(i);
					System.out.println(stu.stuNum+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.mat);
				}	
				
				// 2. 입력 
			}else if(input == 2) {
				Student stu = new Student();
				System.out.print("새로 입력할 학번을 입력해주세요:");
				stu.stuNum = sc.nextInt();
				
				System.out.print("국어의 성적은?");
				stu.kor = sc.nextInt();
				
				System.out.print("영어의 성적은?");
				stu.eng = sc.nextInt();
				
				System.out.print("수학의 성적은?");
				stu.mat = sc.nextInt();
	
				list.add(stu);
				// 3. 수정
			}else if(input == 3) {	
				// 학번 조회
				update(list, sc);		
				// 4. 삭제
			}else if(input == 4) {
				System.out.println("수정할 학번을 입력하세요 ");
				int su2 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					Student stu = (Student) list.get(i);
					if(stu.stuNum == su2) {
						list.remove(i);
					}			
				}
				// 5. 상세이력
			}else if(input == 5) {
				System.out.print("확인 할 학번을 입력하세요:");
				int su2 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					Student stu = (Student) list.get(i);
					if(stu.stuNum == su2) {
						char score ;
						int sum = stu.eng+stu.kor+stu.mat;
						float avg = sum/3;
						
						switch((int)avg/10){
						case 10 : score = 'A';break;
						case 9 : score = 'A';break;
						case 8 : score = 'B';break;
						case 7 : score = 'C';break;
						default : score ='F';
						}
						System.out.println("학번\t 합계\t 평균\t 학점\t");
						System.out.println(stu.stuNum+"\t"+sum+"\t"+avg+"\t"+score);
					}
				}		
			}
			// 0. 종료 
			if(input == 0)break;	
		}				
	}
	private static void update(List list, Scanner sc) {
		System.out.println("수정할 학번을 입력하세요 ");
		int su2 = sc.nextInt();
		int idx = findIdx(su2, list);
		if(idx==-1) {
			System.out.println("찾는 학번이 없습니다.");
		}
		Student stu = (Student) list.get(idx);
		System.out.print("국어의 성적은?");
		stu.kor = sc.nextInt();
		System.out.print("영어의 성적은?");
		stu.eng = sc.nextInt();
		System.out.print("수학의 성적은?");
		stu.mat = sc.nextInt();
		
		list.set(idx,stu);
}

	
	//  학번 찾기
private static int findIdx(int su2, List list) {

	for (int i = 0; i < list.size(); i++) {
		Student stu = (Student)list.get(i);
		if(stu.stuNum==su2) return i;
	}
	return -1;
}

}
