package com.bit;
class Stu{}
class Arr{
	private int[][] arr = new int[0][0];
	
	void remover(int idx) {
		int[] arr2 = new int[arr.length-1];
		for (int i = 0; i < idx; i++) {
			arr2[i] = arr[i];
		}
		
		for(int i = idx) {
			arr = arr2;
		}
	}
	int size() {
		return arr.length;
	}
	int[] get(int idx) {
		return arr[idx];
	}
	
	void add(Stu su) {
		int[][] arr2 = new Stu[arr.length+1][];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i]; //깊은 복사
		}
		arr2[arr2.length-1] = su;
		arr = arr2; //얕은 복사
		
		//new int[arr.length+1];
//		arr = new int[1];
//		arr[0] = su;
//		//////	2
//		int[] arr2 = new int[2];
//		arr2[0] = arr[0];
//		arr2[1] = su;
//		arr=arr2;
		////////////
		
		//int[] arr2 = new int[3];
		arr2[0] = arr[0];
		arr2[1] = arr[1];
		
		arr2[arr2.length-1] = su;
		arr = arr2;
	}
}



public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr arr = new Arr();
		arr.add(new int[] {1,2,3});
		arr.add(new int[] {4,5,6});
		for (int i = 0; i < arr.size(); i++) {
			int[] temp = arr.get(i);
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]);
			}
		}
	}

}
