package com.bit;

public class Ex03 {

	public static void main(String[] args) {
		String msg1 = "문자"+"열";
		String msg2 = "문자".concat("열");
		
		//레퍼런스 비교 //참조변수에서만 레퍼런스값 비교?
		System.out.println(msg1==msg2);
		//값 비교 
		System.out.println(msg1.equals(msg2));
		byte[] arr1 = msg1.getBytes(); //전부 받아줌.
		char[] arr2 = msg1.toCharArray(); // 문자열형태로 바로 넣어줬지만.
 		char[] arr3 = {'a','b','c','d','e'}; 
		msg1.getChars(0, 3, arr3, 0); //return이 없는 대신에 매개면수에 arr3을 집어넣어줘야함.원하는만큼만.
		System.out.println(new String(arr3));
		System.out.println(msg1.length());
		System.out.println(msg1.toString());
	}

}
