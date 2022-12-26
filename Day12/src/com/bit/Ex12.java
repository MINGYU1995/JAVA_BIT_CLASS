package com.bit;

public class Ex12 {

	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer("java");
		st1.append(1111);
		st1.insert(4, "web");
		st1.insert(st1.length(), 2222);
		st1.replace(4, 8, "JAVA");
		st1.delete(4, 8);
		System.out.println(st1);
		st1.reverse();
		System.out.println(st1);
	}
}
