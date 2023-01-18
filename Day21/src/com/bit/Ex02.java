package com.bit;
			
public class Ex02 extends Thread{
		
	@Override
	public void run() {
		System.out.println(getName()+" start....");
	
		
			System.out.println(getName()+" end....");
		}
	public static void main(String[] args) {
		System.out.println("main start....");
		Ex02 me = new Ex02();
		me.start();
		try {
			me.join(3000); //run Thread 가 끝나기 전까지 대기함.
//			me.wait(1000);
			//Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end....");	
	}
	
}
