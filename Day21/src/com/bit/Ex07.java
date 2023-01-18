package com.bit;
class Lec07 extends Thread{
	boolean boo = true;
	boolean boo2 = true;
	@Override
	public void run() {
		while(boo) {
			if(boo2) {						
				System.out.println("working ...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				yield();
			}
		}
	}
}
public class Ex07 {
	boolean boo = true;
	public static void main(String[] args) {
		Lec07 lec = new Lec07();
		lec.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lec.boo2 = false;	
	}

}
