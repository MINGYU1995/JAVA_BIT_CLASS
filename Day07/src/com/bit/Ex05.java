package com.bit;

public class Ex05 {

	public static void main(String[] args) {
		String st1;
		//st1 = "문자열";
		//st1=null;	//집합객체가 없음
		st1="문자열";		//객체가 있음.
		String st2 = new String("문자열");	
		String st3 = "문자열";
		java.util.Scanner sc;
	    sc = new java.util.Scanner(System.in);
	    String st4=sc.nextLine(); //입력받는 값이 문자열인지 모르니까 st2랑 똑같은 격
	  
		System.out.println(st1==st2); //객체와 st1스트링변수랑은 다름.
		System.out.println(st1==st3);//레퍼런스 비교
		System.out.println(st1==st4);
		
	}
}
