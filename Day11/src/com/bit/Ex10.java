package com.bit;
import java.util.*;
public class Ex10 {

	static int count = 1;
	static int count2 = 0;
	public static void main(String[] args) {
		int [] lotto = new int[7];
		String [] inputSuArry = new String[8];
		int tmpLottoNum[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.print("로또 번호를 입력해주세요:");
		String inputSu;
		
		//랜덤하게 뽑혀야한다. 
		//중복이없어야한다. 
		//마지막에 sort 3가지..의 개념 이것이 한가지 방법.
		
		//객체를 활용한다. 2번째 
		
		//아이디어
		
		//inputSu = sc.nextLine();
		//int inputSu = sc.nextInt();
		//String input = sc.nextLine();
		//System.out.println(inputSuArry);
		
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
		    public void run() {
				if(count2 <= 6){ 			    
				    lotto[count] = (int)(Math.random()*45)+1;
				    System.out.println("[로또 번호 생성중 : "+lotto[count]+"]");

				}
				else{
					timer.cancel(); 
					System.out.println("[로또 생성 종료]");
					for (int k = 0; k < lotto.length-1; k++) {
						System.out.print(k+1+"번째 번호:" +lotto[k+1]+" ");
						//System.out.println();					
					}
//					for (int j = 0; j < inputSuArry.length; j++) {
//						System.out.print(inputSuArry[j]);
//					}
					
				}
		    }	
		}; //run 
		timer.schedule(task, 500, 500); //실행 Task, 1초뒤 실행, 1초마다 반복	
		
		
	} //main

}
