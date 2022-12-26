package com.bit;
import java.util.LinkedList;
import java.util.ArrayList;
public class Ex04 {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		java.util.ArrayList arr = new ArrayList(); //특수한 목적을 가지고 있지 않은 이상 이걸쓴다.?
		//java.util.LinkedList arr = new LinkedList();
		
		for (int i = 0; i < 100000; i++) {
			arr.add(i);
		}for (int i = 0; i < arr.size(); i++) {
			Object obj = arr.get(i);	
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println(after-before);
		
//		arr.add(2222);
//		arr.add(3333);
//		arr.add(4444);
//		for (int i = 0; i < arr.size(); i++) {
//			int obj = (int)arr.get(i);
//			System.out.println(obj);
//		}
	}

}
