package com.bit;

public class Ex08 {

	public static void main(String[] args) {
		boolean boo1 = true;
		Boolean boo2 = new Boolean(true);
		Boolean boo3 = new Boolean("faluse");
		Boolean boo4 = new Boolean("True");
		System.out.println(boo3.compareTo(boo4));
	}

}
