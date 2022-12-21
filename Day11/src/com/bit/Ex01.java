package com.bit;
import java.util.*;
//학생성적관리프로그램(0.2.0)
//교과목 - java,web,framework 학번
//1. 리스트는학생들. 2.입력 3.상세보기 ,4.삭제 0.종료>
//리스트에서 데이터만 -학번,j,w,f
//상세보기 - 각 학점 , 합계  , 평균학점. // 총점 /학생평균/전체평균 /학점
//제출 
//양식에 맞춰
//각 메뉴별 스샷 (실행)
//1차평가_박민규.docx
//1.동적할당(20) 2.수업 외 동적할당(15)
//3.시작시 총인원 입력받기 (10) 4.기타(5)
//	- [10]합계 평균(소수점둘째자리,각학생의 평균/전체평균) 학점
//  - [5]각 학점 합계 평균 학점
// 제출양식(10) -2//학번은 자율

class Student{
	int java,web,framework ,stuNumber;
	String name ="";
	public Student(String name,int stuNumber) {
		this.name = name;
		this.stuNumber = stuNumber;	
	}
	
	int total(){ //합계
		return java+web+framework;
	}
	
	double avg() { //평균
		return total()*100/3/100.0;
	}
	
	char score() { // 학점
		if(total()>=3*90)return 'A';
		if(total()>=3*80)return 'B';
		if(total()>=3*70)return 'C';
		if(total()>=3*60)return 'D';
		return 'F';
	}		
}
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("총인원:");
		int hmp = sc.nextInt(); //총인원에 대한 
		int input = 0;
		boolean boo = true; 
		Student[] data = new Student[hmp];
		int cnt = 0 ;
		while(boo) {
			System.out.print("1.리스트 2.입력 3.삭제 4.상세보기 0.종료>");
			input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("수고하셨습니다.");
				break;
			}else if(input == 1) {
				System.out.println("-------------------------");
				System.out.println("이름\t학번\tjava\tweb\tframework");
				System.out.println("-------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					if(data[i] == null)break;
					System.out.println(stu.name + "\t" + stu.stuNumber + "\t" + stu.java
							+ "\t" + stu.web + "\t" + stu.framework);
				}
				System.out.println("-------------------------");

				//리스트
			}else if(input == 2) {
				Student stu;
				
				System.out.print("이름>");
				String inputStr = sc2.nextLine();
				
				System.out.print("학번>");
				input = sc.nextInt();
				stu = new Student(inputStr,input);
				
				System.out.print("java>");
				input = sc.nextInt();
				stu.java = input;
				
				System.out.print("web>");
				input = sc.nextInt();
				stu.web = input;
				
				System.out.print("framewrok>");
				input = sc.nextInt();
				stu.framework = input;
				
				data[cnt++] = stu;
				//입력
			}else if(input == 3) {
		
				
			}else if(input == 4) {
				//상세이력
				System.out.print("학번>");
				input = sc.nextInt();
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					if(input == stu.stuNumber) {
						System.out.println("합계:" + stu.total());
						System.out.println("평균:" + stu.avg());
						System.out.println("학점:" + stu.score());
						break;
					}
				}
			}
			

		}
		
		

	}

}
