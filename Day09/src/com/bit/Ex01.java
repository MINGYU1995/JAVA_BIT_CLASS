package com.bit;

public class Ex01 {
	//continue; - 반복문 - 이번반복에서 이후 실행문을  skip
		//return; - 메서드내부 어디서든
		//break; - switch문, 반복문
		
		//continue는 반복문만에서만 가능 continue를 만나면 실행하다가 진행하지 않고 바로 처음으로 돌아감.
		//return은 break 랑 다르게 어디든 가능.
		//이조건의 성립이되면 탈출이다 ..break를 사용할 수 있는 위치가 있다. switch,반복문(for,while)
		//특징 ? for 중괄호 밖으로 빠져나간다. 2중반복문이라면 안쪽 반복문만 빠져나간다
	
	public static void func03() {
		System.out.println("func03 start");
		int su = 5;
		for (int i = 0; i < 10; i++) {
			switch(i) { //switch문에서 반복문 탈출불가.
			case 5 :return;
			case 3 :
			case 1 :
			}
			System.out.println("실행중...."+i);
		}
		System.out.println("func03 end");
	}
	
	public static void func02() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==2)continue;
				System.out.println("i="+i+", j="+j);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		func03();
		//func02();
		//func01();
	}
	public static void func01() {
		
		for (int i = 0; i < 10; i++) { 
			System.out.println("BEFORE I = "+i);
			if(i>5)break; 
			System.out.println("after i = " +i);
		}
	}

}


