package com.bit;

public class Ex10 {

	public static void main(String[] args) {
		String[] arr1 = new String[4];
		Ex10[] arr2 = new Ex10[3];
		arr2[0] = new Ex10();
		int[][] arr3;
		arr3 = new int[3][2];
		//string배열 자체가 객체배열인데 따로 구분해놓지 말자
		arr3[0] = new int[] {1,2,3};
		arr3[1] = new int[] {4,5};
		arr3[2] = new int[] {6};                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
				
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
	}

}
