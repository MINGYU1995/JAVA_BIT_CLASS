package com.bit;

public class Ex04 {

	public static void main(String[] args) {
		String st1 = "abcabcdefg";
		System.out.println(st1.charAt(0)); // 문자열배열의 원소 인덱스 값 찾기.
		System.out.println(st1.contains("cde"));
		System.out.println(st1.contains("CDE"));
		System.out.println(st1.startsWith("a")); //** 시작하는...
		System.out.println(st1.endsWith("fg"));	// 끝나는 원소가 이게 맞냐? t/f
		System.out.println(st1.indexOf('d')); //해당 인덱스값 출력 
		System.out.println(st1.indexOf('a',1)); //제일 처음 확인된 문자인덱스값 출력  1은 시작지점지정
		System.out.println(st1.indexOf("abc")); //string도 출력가능 0이 출력 
		System.out.println("".isEmpty());
		System.out.println("".length()==0); // 이걸 많이씀.
		System.out.println(st1.lastIndexOf('a',2)); 	
		System.out.println(st1.indexOf('A'));
		
		
		String st2 = st1.substring(3); 
		System.out.println(st2);	//abcdefg
		
		String st3 = st1.substring(3,6);
		System.out.println(st3);	//abc
		
		String st4 = st1.substring(3,st1.length());
		System.out.println(st4);//abcdefg
		
		String st5 = st1.replace('g','A');
		System.out.println(st5);
		System.out.println(st1);
	}
	
}
