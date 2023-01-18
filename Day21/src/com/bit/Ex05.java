package com.bit;

class Lec05 extends Thread{
	int su1,su2;
	static int sum;
	
	static Object key = new Object();
	
	public Lec05(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	public synchronized void hap(int a) {
			int tot = sum+a;
			sum = tot;
	}
	
	@Override
	public void run() {
		hap(su1);
		System.out.println(su1+"~"+su2+"="+sum);
	}
}
public class Ex05 {
	public static void main(String[] args) {
		
		Ex05 key = new Ex05();
		Lec05 lec1 = new Lec05(1,500);
		Lec05 lec2 = new Lec05(501,1000);
		
		
		Thread thr1 = new Thread();
		Thread thr2 = new Thread();
	
		
		thr1.start();
		thr2.start();
		
	}
}
