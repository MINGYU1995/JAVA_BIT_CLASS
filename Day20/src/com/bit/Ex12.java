package com.bit;

public class Ex12 {
	//OS가 스케쥴링 하는시점과 프로세스가 쓰레드를 스케쥴링 하는 시점이 만나면 일을함.
	//우선순위를 가지고 쓰레드를 정한다는 건 확률싸움임? 쓰레드 제어가 가능함.해봤자 효과x 
	
	public static void main(String[] args) {
		// setPriority 1~10
		// default 5
		// max 10
		// min 1 hjn
		// 상대적 빈도수 
		
		Thread me = Thread.currentThread();
		//me.setPriority(Thread.NORM_PRIORITY);
		System.out.println("main thread:"+me.getPriority());
		Runnable thr = new Runnable() {
		
			
		public void run() {
			Thread thr = Thread.currentThread();
			int su = thr.getPriority();
			System.out.println(thr.getName()+"Thread..start");
			System.out.println(thr.getName()+"New Thread...");
			try {
				Thread.sleep(3000);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thr.getName()+" Thread..end");
		}
	};
	Thread thr1 = new Thread(thr);
	Thread thr2 = new Thread(thr);
	thr1.setPriority(Thread.MAX_PRIORITY);
	thr2.setPriority(Thread.MIN_PRIORITY);

	thr1.start();
	thr2.start();
	

	}

}
