package com.bit;

public class Ex04 {

	public static void main(String[] args) {
		Runnable work = new Runnable() {
			
			@Override
			public void run() {
				Thread thr = Thread.currentThread();
				String name = thr.getName();
				System.out.println(name);
			}
		};
		Thread thr = new Thread(work);
		thr.start();

	}

}
