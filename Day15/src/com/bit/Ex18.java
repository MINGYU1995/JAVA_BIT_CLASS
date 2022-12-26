package com.bit;

import java.util.StringTokenizer;

public class Ex18 {

	public static void main(String[] args) {
		String target = "java web DB Freamwork";
		String[] arr1 = target.split(",");
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		StringTokenizer stk;
		stk = new StringTokenizer(target,",");
		System.out.println(stk.countTokens());
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
		

	}

}
