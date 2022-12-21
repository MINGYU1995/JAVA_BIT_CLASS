package com.bit;


class Lec02{ //class 퍼플릭과 프로텍티드만 적용.
	
	//public > protected >= default > private
	protected int su1;
	
	protected void func01() {}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec02 me = new Lec02();
		System.out.println(me.su1);
		me.func01();
	//	com.bit2.Lec22 you;
		//you = new com.bit2.Lec22();
//		System.out.println(you.su1);
//		you.func02();
		
		Ex02 me2 = new Ex02();
		System.out.println(me.su1);
		//me2.func02();
		//me2.func03();
		
	}

}
