package com.bit;
//레퍼 클래스 (래핑boxing /unboxing)
public class Ex08 {
	//필요할 때만 레퍼클래스를 사용해라. 
	//기본자료형이랑 다른 앞에 대문자를 보면 알수 있다.
	
	public static void func(Object su) {}

	public static void main(String[] args) {
		// 래퍼 클래스
		int su1 = 1111;
		Integer su2 = new Integer(2222);
		Integer su3 = 3333;
		Integer su4 = new Integer("3333");
		System.out.println(su3.intValue() == su4.intValue());
		System.out.println(su3==su4); //false 다 레퍼런스 비교니깐.
		System.out.println(su3.equals(su4)); //true 안에 값 비교니깐. 
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("1234")+1);
		int su = 2;
		System.out.println(Integer.reverse(su));
		int su9 = 10;
		System.out.println(Integer.toBinaryString(su9));
		System.out.println(Integer.toOctalString(su9));
		System.out.println(Integer.toHexString(su9));
		
		byte su11 = 1;
		Byte su10 = new Byte(su11);
		
		System.out.println(Integer.compare(su2, su3));
		System.out.println(su2.compareTo(su3));
		
		
	}

}
