package com.bit;

public class Ex01 {

	public static void main(String[] args) {
		
		
		String msg1 = "문자열";
		String msg2 = "문자";
		String msg3 = "열";
		String msg4 = msg2+msg3;
		String msg5 = "문자"+"열";
		String msg6 = "문자".concat(msg3);
		System.out.println(msg6); 
		System.out.println(msg1 == msg5); //t
		System.out.println(msg1 == msg6); //f
		//System.out.println(msg1==msg2+msg3);//f
		//System.out.println(msg1==msg4); //f
		
		
		//System.out.println(msg1==msg5);//t 상수 메모리 올릴때 
		
		//String st1 = new String();
		//System.out.println(st1);
		
	
		//네이밍 잘 짓기.
		//new String 으로 값을 가져오면 항상 새로 객체. 
		//String msg1 = "abc"외에는 전부 각각 새로운 객체임.
		char[] arr= {'a','b','c','d'};
		String st2 = new String(arr,0,3);
		String st3 = new String("문자열");
		
		System.out.println(st3);
		
	}

}
