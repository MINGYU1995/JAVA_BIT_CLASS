package com.bit;
//추상메서드 활용되는 예시
//자바의 장점. 
//다형성.
abstract class Machine{
	void on() {
		System.out.println("켜다.");
	}
	void off() {
		System.out.println("끄다.");
	}
	abstract void work(); //정의만 하고 Audio 메서드에 구현을 함.
}
class Tv extends Machine{
	void work() {
		System.out.println("방송 주파수를 잡아 화면과 소리를 출력.");
	}
}
class Radio extends Machine{
	void work() {
		System.out.println("주파수를 잡아 소리를 들려준다.");
	}
}
class Audio extends Machine{
	@Override
	void work() {
		System.out.println("음악을 들려준다.");
	}
}


public class Ex07 {
  //하나의 객체를 생성할 때 여러 기능을 공통으로 사용할 수 있는 부분?
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		System.out.println("1.tv 2.radio 3.radio>");
		
		int input = sc.nextInt();
		Machine remote;
		if(input == 1) {
			remote = new Tv();	
		}else if(input == 2){
			remote = new Radio();
		}else {
			remote = new Audio();
		}
		remote.on();
		remote.work();
		remote.off();
	}
}





