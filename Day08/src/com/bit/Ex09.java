package com.bit;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr1 = null;
		arr1 = new int[4]; //{2,3,6,8}; 이건 사용을 지양해야한다. 그이유는 숫자지만 int인걸 보장할 수 없다. 
		
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
