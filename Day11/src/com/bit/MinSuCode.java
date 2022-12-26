package com.bit;

class OnAir2{
	
	int[] arrNum = new int[6];
	int count = 0;
	
	// 게임 시작
	void start() throws InterruptedException {
		System.out.println("이번주 로또 시작합니다!");
		while(count < 6) {
			pick();
		}
		System.out.print("이번주 당첨 번호는 ");
		show();
	}
	
	
	// 로또 공 뽑기
	void pick() throws InterruptedException {
		int num = (int)(Math.random()*45)+1;
		boolean isOk = checkDupl(num);
		if(isOk) {
			System.out.print((count + 1) + "번째 공은 ");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(200);
				System.out.print(".");
			}
			Thread.sleep(300);
			System.out.println(" " + num +"입니다");
			Thread.sleep(500);
			arrNum[count] = num;
			count++;
		}
	}
	
	// 중복 번호 체크	
	boolean checkDupl(int num) {
		boolean boo = true;
		for (int i = 0; i < arrNum.length; i++) {
			if(arrNum[i] == num) boo = false;
		}
		return boo;
	}
	
	// 결과 화면 출력
	void show() throws InterruptedException {
		// 오름 차순 정렬
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum.length-i-1; j++) {
				int temp = 0;
				if(arrNum[j] > arrNum[j+1]) {
					temp = arrNum[j+1];
					arrNum[j+1] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < arrNum.length; i++) {
			Thread.sleep(200);
			System.out.print(arrNum[i]+ " ");
		}
	}
	

}



class MyLotto extends OnAir2 {
	
	// Lotto 구매
	void buyLotto(int[] arrChoice) throws InterruptedException {
		for (int i = 0; i < arrNum.length; i++) {
			if(i<arrChoice.length) {
				arrNum[i] = arrChoice[i];
			} else {
				while(true) {
					int num = (int)(Math.random()*45)+1;
					boolean isOk = checkDupl(num);
					if(isOk) {
						arrNum[i]=num;
						break;
					}
				}
				
			}
		}
		
		// 내가 산 로또 번호 출력
		System.out.print("내가 산 로또 번호는 ");
		show();
		
	}
		
}



public class MinSuCode {

	public static void main(String[] args) throws InterruptedException {
		
		// 로또 구매
		MyLotto myLotto = new MyLotto();
		// 번호 선택
		int[] choiceNum = {1, 3, 29};
		// 번호 확인
		myLotto.buyLotto(choiceNum);
		
		
		System.out.println();
		Thread.sleep(200);
		
		// 토요일 오후 08 시 40분 방송시작
		OnAir2 onAir = new OnAir2();
		onAir.start();
		System.out.println();
		
		// 당첨 확인
		checkResult(myLotto, onAir);
		
	}

	private static void checkResult(MyLotto myLotto, OnAir2 onAir) throws InterruptedException {
		int[] arrLotto = myLotto.arrNum;
		int[] arrAir = onAir.arrNum;		

		Thread.sleep(200);
		System.out.println("내가 맞춘 번호는");
		Thread.sleep(200);
		int count = 0;
		for (int i = 0; i < arrLotto.length; i++) {
			for (int j = 0; j < arrAir.length; j++) {
				if(arrLotto[i] == arrAir[j]) {
					System.out.print(arrLotto[i] + "번");
					Thread.sleep(200);
					count++;
				}
			}
		}
		if(count==0)System.out.println("하나도 못 맞췄습니다.\n꽝");
		System.out.println("총 " + count + "개 맞췄습니다.");
		Thread.sleep(200);
		switch(count) {
			case 6: System.out.println("1등 당첨 입니다."); break;
			case 5: System.out.println("2등 당첨 입니다."); break;
			case 4: System.out.println("3등 당첨 입니다."); break;
			case 3: System.out.println("4등 당첨 입니다."); break;
			default: System.out.println("꽝!");
		}
		
		
	}
	
	
	
}