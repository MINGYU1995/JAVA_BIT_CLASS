package com.bit;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,3,5,7};

		int[] arr2 = arr1; // 배열의 얕은 복사 한쪽에서 제어를 하면 영향이 간다.
		//arr1[1] = 2;
		//arr1[2] = 6; //6이 나오는 이유는 배열은 참조변수이기 떄문.
		
		//for(int i=0; i <arr2.length; i++) {
	//		System.out.println(arr2[i]);
//		}
		
		
		// 배열의 깊은 복사
		int[] arr3 = new int[4];//= new int[] {1,3,5,7};
		for(int i = 0; i<arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		
		arr1[1]=2;
		func1(arr1);
		for(int i=0; i <arr3.length; i++) {
			System.out.println(arr3[i]);
		}	
	}
	public static void func1(int[] arr) {
		arr[0]=0;
	}
}
