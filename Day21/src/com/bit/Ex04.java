package com.bit;

public class Ex04 extends Thread {
	boolean boo;
	public Ex04(boolean boo) {
		this.boo = boo;
	}	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(boo) yield();
			System.out.println(getName()+" working...."+i);		
	}
}
	public static void main(String[] args) {
		Ex04 ex1 = new Ex04(false);
		Ex04 ex2 = new Ex04(true);
		ex1.start();
		ex2.start();
		ex2.yield();
	}
}
