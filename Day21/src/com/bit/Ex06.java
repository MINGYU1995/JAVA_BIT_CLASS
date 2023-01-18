package com.bit;

class Lec06 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				System.out.println(i + 1 + "번 수행 ...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i > 1)
					notifyAll();
			}
		}
	}
}
public class Ex06 {
	public static void main(String[] args) {
		System.out.println("main start...");
		Lec06 lec = new Lec06();
		lec.start();
		synchronized (lec) {
			try {
				Thread.sleep(500);
				lec.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main start...");
	}
}