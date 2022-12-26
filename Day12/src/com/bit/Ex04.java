package com.bit;
//예외처리
public class Ex04 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(arr[i]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("에러잡음");
			}
		}
			
	}

}
