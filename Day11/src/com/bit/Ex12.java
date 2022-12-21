package com.bit;
import java.util.*;

//랜덤하게 뽑혀야한다. 
//중복이없어야한다. 
//마지막에 sort 3가지..의 개념 이것이 한가지 방법.

//번호 생성 
//중복 제거 
//정렬 
class ChuChum{
	
	int [] Lotto = new int[7];
	int tmp = 0;
	Timer timer = new Timer(); //타이머 함수.
	int count = 0;
	
	void Timer() {
		TimerTask task = new TimerTask() {
			public void run() {
				if(count < 6) { //count변수가 Lotto 배열의 인덱스범위 밖을 접근하여 오류 여러번 났음.
					count++;
					
					System.out.println(count+"번째 번호:.."+Lotto[count]);
					//System.out.println(count);
				}else {
					timer.cancel(); 
					SortShow();
				}			
			}	
		};
		timer.schedule(task, 800, 800); 	
	}
	
	
	void lotGet(){
		for (int i = 0; i < Lotto.length; i++) { //번호생성중복없이
			Lotto[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i; j++) {
				if(Lotto[j] == Lotto[i]) {
					i--;			
				}
			}	
		}	
	}
	
	void SortShow() {	
		for (int i = 0; i < Lotto.length; i++) { //안에 j의 기준을 잘 정립해야함.
			for (int j = i+1; j < Lotto.length; j++) { //sort
				if(Lotto[i] > Lotto[j]) {
					tmp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = tmp;
				}
			}
		}	
		for (int j = 1; j < Lotto.length; j++) {
			System.out.print(Lotto[j]+" ");	
		}	
		System.out.println("입니다");
	}
}

class LottoBuy extends ChuChum{
	
	
}


public class Ex12 {

	public static void main(String[] args) {
		System.out.println("로또추점 시작!");
		ChuChum Chu = new ChuChum();
		Chu.lotGet();
		Chu.Timer();
		
		//번호 생성 
		//중복 제거 
		//정렬 
			
	}
}

