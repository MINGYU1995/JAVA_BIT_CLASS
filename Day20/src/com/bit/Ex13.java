package com.bit;
//쓰레드 직접제어

import java.awt.Frame;
import java.awt.Label;
import java.util.Date;
import java.util.Scanner;

class Lec13 extends Frame implements Runnable {
	Label la = new Label();

	public Lec13() {
		add(la);
		
		setBounds(100,100,300,150);
		setVisible(true);
	}
	public void run() {
		
		while(true) {
			la.setText(new Date().toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class Ex13 {

	public static void main(String[] args) {//쓰레드 메인에서 제어
		//메인을 리턴시켜 종료하듯이 run메서드 쓰레드를 무한루프에서 빠져나오게해야함.
		//
		Lec13 ti = new Lec13();
		Thread thr = new Thread(ti);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.시작 2.멈춤 3.재시작 4.종료 0.끝>");
			int input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1)thr.start();
		
			if(input == 2)thr.suspend();
			
			if(input == 3)thr.resume();
			
			if(input == 4)thr.stop(); 
			//후행작업에 대한 여지없이 종료를 시키는 stop
			
		}

	}

}
