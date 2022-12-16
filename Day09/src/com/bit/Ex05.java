package com.bit;

class Lec05{
	int su1 = 1111;
	
	void func01() {
		System.out.println("부모기능" + su1);
	}
}
public class Ex05 extends Lec05{
	int su1=2222;
	void func01() {
		super.func01();
		System.out.println("자식기능"+super.su1);
	}
	void func02() {
		System.out.println("다른기능2");
	}
	
	
	public static void main(String[] args) {
		Lec05 me1 = new Lec05();
		me1.func01();
		//상속은.
		Ex05 me2 = new Ex05();
		me2.func01();
		me2.func02();
		
		Lec05 me3 = new Lec05(); //부모(타입) = 자식(객체) *반대는 안됨.
		me3.func01(); //부모메서드는 호출하지만 자식기능을 수행함.
		//((Ex05)me3).func02(); //다시 자식으로 캐스팅도 가능함.
		//me3.func02(); 얘는 안됨.자식메서드는 불가

	}

}
