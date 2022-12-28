package com.bit;
import java.util.*;
import java.util.HashMap;

class Student{
	String name;
	int stuNum,kor,eng,mat;
	
}
//map(key,value)
//제네릭 사용
public class Ex22 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean boo = true;
		
		System.out.println("학점계산기 ver 0.4.0");
		
		do {
			//CRUD 순으로
			System.out.println("0.종료/1.리스트/2.입력/3.삭제/4.상세이력/5.수정");
			int input = sc.nextInt();
			
			//리스트
			if(input == 1) {
				System.out.println("이름\t학번\t국어\t영어\t수학\t");
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					System.out.println(stu.name+"\t"+stu.stuNum+"\t"+stu.kor+"\t"
					+stu.eng+"\t"+stu.mat);					
				}
				
			//입력
			}else if(input == 2) {
				//Hashmap 초기화타입이 S,I 이기 때문에 이름은 생략.
				Student stu = new Student();
				System.out.print("이름>");
				stu.name = sc2.nextLine();
				
				
				System.out.print("학번>");
				stu.stuNum = sc.nextInt();
				
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				map.put("국어", stu.kor);
				
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				map.put("영어", stu.eng);
				
				System.out.print("수학>");
				stu.mat = sc.nextInt();
				map.put("수학",stu.mat);
				
				
				list.add(stu);
			
			
			//삭제
			}else if(input == 3) {
				//삭제할 key를 입력받게하여 그 key에 해당하는 value값을 수정하면 됨.
			
			//상세이력
			}else if(input == 4) {
			
			//수정
			}else if(input == 5) {
				//수정할 key를 입력받게하여 그 key에 해당하는 value값을 수정하면 됨.
				System.out.print("수정할 과목을 작성해주세요>");
				String strInput = sc2.nextLine();
				String[] temp = new String[map.size()];
				
			        System.out.println(map);	
			        System.out.println(strInput);
			        
				
	
	
			
			//종료
			}else break;
			
				
			
			
		}while(boo);
		
			
		
	}

}
