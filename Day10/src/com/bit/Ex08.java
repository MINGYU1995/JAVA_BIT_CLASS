package com.bit;
	
interface Lec08{ //객체생성대상이 아니다. 
	public final static int su1 = 1111; //final,static 전부 생략될 수 있다.
	final static int su2 = 2222;
	static int su3 = 3333; //final 생략 
	int su4 = 4444;
	
	public abstract void func01();
	//public void func03(); 
	void func04();
}

interface Lec888{}
interface Lec88 extends Lec08,Lec888{ //인터페이스끼리 상속은?
	public abstract void func03();
	
}
public class Ex08 extends Object 
			implements Lec88 { //다중상속 가능함. interface는 클래스x라서
	public void func01() {}
	public void func02() {}
	
	public static void main(String[] args) {
		Lec08 me = new Ex08();
		me.func01();
		System.out.println(Lec08.su4);
	//	Lec08.su3++; final이라 불가능.
	}
	@Override
	public void func04() {
		// TODO Auto-generated method stub
	}
	@Override
	public void func03() {
		// TODO Auto-generated method stub
	}
}
