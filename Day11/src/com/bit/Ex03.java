package com.bit;

final class Lec03{ //final class 상속금지.
	final static int su2 = 2222;
	final int su3 = 3333;
	
	public static void func01(final int su) { //여기서 초기화
		
	}//여기까지 매개변수 변경 x 
	//final 메서드는 오버라이드 금지
	public final void fucn02() {}
}

public class Ex03 {
	
	public void fucn02() {}
	
	public static void main(String[] args) {
		final int su1=1111;
		Lec03.func01(1);
		Lec03.func01(2);
		

	}

}
