package com.bit;

public class Ex09 {

	public static void main(String[] args) {
		String msg1 = "한글";
		char[] arr1 = msg1.toCharArray();//자바 toCharArray() 메소드는 문자열을 char형 배열로 바꿔준다. 
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		char[] arr2 = new char[4];
		arr2[0] = '한';
		arr2[1] = '글';
		arr2[2] = '작';
		arr2[3] = '성';
		String msg2 = new String(arr2);
		System.out.println(msg2);


	}

}
