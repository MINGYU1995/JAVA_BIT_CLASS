package com.bit;
//자바는 다중상속을 지원하지 않습니다.
class Lec22{}
// 부모클래스, super class
class Lec02 extends Object{//부모클래스
	int su1 = 111;
	void func01() {
		System.out.println("부모기능");
	}
}
public class Ex02 extends Lec02{ //자식클래스
	
	void func02() {
		
	}
	public static void main(String[] args){
		Ex02 me = new Ex02();
		System.out.println(me.su1);
		me.func01();

	}

}
