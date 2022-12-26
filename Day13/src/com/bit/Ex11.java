package com.bit;

public class Ex11 {

	public static void main(String[] args) {
		//순서가 없는 자료구조. - 집합.
		//중복 허용 x 
		//2.순서
		java.util.Set set1;
		set1 = new java.util.TreeSet();
		set1.add("첫번째");
		set1.add("2번째");
		set1.add("3번째");
		set1.add("4번째");
		set1.add("5번째");
		
		System.out.println(set1.remove(new String("첫번째")));
		java.util.Iterator ite;
		ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		Object[] arr = set1.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
