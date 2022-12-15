package com.bit;

public class Ex12 {

	public static void main(String[] args) {
		//배열 깊은 복사 *제일 많이 쓰는 배열복사방법
		int[] target = {1,3,5,7,9};
		int[] result = new int[10];
		
		System.arraycopy(target,0,result, 2 , 3 ); //(원본 , 0, 복사 , 시작위치,복사갯수(앞에서짜름))
		target[1]=2;
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}	
		System.out.println();

	   
	}

}
