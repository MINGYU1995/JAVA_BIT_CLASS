package com.bit; //클래스를 활용한 로또 생성

class Ball{
	private static int cnt = 0;
	final int num;
	boolean marking;
	String color;
	
	//노,파,빨,검,초 
	Ball(){
		cnt++;
		num = cnt;
		if(cnt<11)color = "노랑";
		else if(cnt<21)color = "빨강";
		else if(cnt<31)color = "검정";
		else if(cnt<41)color = "초록";
		else color = "파랑";
		
		
	}
}
public class Ex02 {

	public static void main(String[] args) {
		int limit = 6;
		Ball[] box = new Ball[limit];
		int[] note = new int[6]; //note에 
		
		for (int i = 0; i < box.length; i++) {
			box[i] = new Ball();
		}
		
		int cnt = 0;
		while(true) {
			int ran = 0;
			ran = (int)(Math.random()*limit)+1;
			Ball ball = box[ran];
			if(!ball.marking) {
				note[cnt++] = ball.color + "색 공" + ball.num + "번";
				ball.marking = true;
			}
			if(cnt == note.length)break;
		}
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}
	}
}
