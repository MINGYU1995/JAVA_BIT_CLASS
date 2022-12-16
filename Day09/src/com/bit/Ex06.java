package com.bit;

class Lec06{
	
	public Lec06() { //이걸만드는 동시에 자동으로 디폴트 생성자를 만들수 없기 때문에 오류가남.//매개변수라서?.
		
	}
	
	
	void func01() {
		System.out.println("부모기능");
	}
}
public class Ex06 extends Lec06{
	//부모의 기능을 쓰기 위해선 부모의 객체를 찍어야한다고..
	//this와 super는 공존 할 수가없다*. super를 찍으면 부모의 객체를 찍고 부모의 그 부모의 조상부모까지.
	//디폴트 생성자는 super가 있어야만 부모의 객체를 찍어낼 수 가 있다.
	public Ex06() {
		super(); //super
	}

	
	
	
	
	public Ex06(int a) {
//		super(); 먼저 찍혀야. 함 부모클래스찍히고 -> 자식클래스 순임.
		System.out.println("객체생성");
		
	}
	public static void main(String[] args) {
		Ex06 me = new Ex06();
		me.func01();

	}

}
