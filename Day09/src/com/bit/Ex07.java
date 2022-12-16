package com.bit;
import java.util.*;

public class Ex07 {
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
	int java = 0, web = 0, framework = 0;
	int studentNumber = 0;
	int [] studentInputNumber = new int[10]; //입력받은 여러학번
	int studentNumberTemp = 0;
	int [] allStudentSum = new int[10];
	float allSum = 0;
	char score = ' ';
	static int allCount = 0;
	float sum = 0 , avg = 0;
	String list =""; 
	String [] students = new String[10]; // 상세이력에 저장할 int형 배열
	String [] stuList = new String[10];
	static int count = 0;
	int sumCount = 1;

	
	Scanner calsc = new Scanner(System.in);

	public static void main(String[] args) {
		int firstInput = 0;
	
		System.out.println("학생성적관리프로그램(0.2.0)");
		//System.out.println("1.리스트 2.입력 3.삭제 4.상세보기 0.종료>");
		Scanner Insc = new Scanner(System.in);
		boolean boo = true;
		Ex07 me = new Ex07();
		System.out.print("입력하실 총 인원을 써주세요.");
		allCount = Insc.nextInt();
		
		do{
			System.out.print("1.리스트 2.입력 3.삭제 4.상세보기 0.종료>");
			firstInput = Insc.nextInt();
			switch(firstInput) {	
			case 1 :  me.List();
					  break; 
			case 2 :  me.Cal();
					  break;
			case 3 :  me.Del();
					  break;
			case 4 :  me.View();
					  break;
			default : boo = false; break;		
			}				
		}while(boo);	
		System.out.println("이용해주셔서 감사합니다.");	
	}
	public void Cal() {
		int i = 0;
		while(allCount > i) {
			i++;
			System.out.print("새로 입력할 학번을 입력해주세요:");
			studentNumber = calsc.nextInt();
			
			System.out.print("java의 성적은?");
			java = calsc.nextInt();
			
			System.out.print("web의 성적은?");
			web = calsc.nextInt();
			
			System.out.print("framework의 성적은?");
			framework = calsc.nextInt();
			
			sum = java+web+framework;
			avg = sum/3;
			
			String avg2 = String.format("%.2f", avg);
			String sum2 = String.format("%.2f", sum);
			
			allSum += (int)avg;
			allSum = allSum/sumCount;
			
			String allSum2 = String.format("%.2f", allSum);
			//3개의 과목에 대한 평균 학점.
			switch((int)avg/10){
			case 10 : score = 'A';break;
			case 9 : score = 'A';break;
			case 8 : score = 'B';break;
			case 7 : score = 'C';break;
			default : score ='F';
			}
			stuList[count] = "학번:"+studentNumber +"\njava:"+ java+"\nweb:"+web+"\nframework:"+framework+"\n ---------\n";
			studentInputNumber[count] = studentNumber; //입력받을때마다 학생의 학번을 저장.
			//상세보기 - 각 학점 , 합계  , 평균학점. // 총점 /학생평균/전체평균 /학점
			students[count] = studentNumber+":학번의 학점은"+score+"이고"+"합계는"+sum2+"이고"+"평균총점은 "+avg2+ "입니다.학생 전체평균은 :"+allSum2+"점입니다. \n"; //소숫점 고쳐야함. //상세
			count++;
			sumCount++;
		}
		i = 0;
	}
	public void List() { //리스트에서 데이터만 -학번,j,w,f
		for (int i = 0; i < count; i++) {
			System.out.println(stuList[i]);
		}
	}
	//student 는 학번 + 학점 평균 이 들어가 있는 String 배열 변수이다.
	//studentInputNumber 학번을 구별하기 위해 만든 int 배열 변수 
	//studentNumberTemp del 메서드에서 입력값으로 받을 변수.
	public void Del() {
		System.out.print("어떤 학생의 학번을 삭제할까요?");
		System.out.println("학번은?");
		studentNumberTemp = calsc.nextInt();	
		for (int i = 0; i < studentInputNumber.length; i++) {
			if(studentInputNumber[i] == studentNumberTemp) {
				students[i]=" ";
				stuList[i]=" ";	
			}	
		}
		studentNumberTemp = 0;
		System.out.println("삭제성공");		
	}
	public void View() { //상세보기
		System.out.print("확인할 학번을 입력해주세요:");
		studentNumberTemp = calsc.nextInt();
		for (int i = 0; i < studentInputNumber.length; i++) {
			if(studentInputNumber[i]==studentNumberTemp) {
				System.out.println(students[i]);
				return;
			}
		}						
	}
}
