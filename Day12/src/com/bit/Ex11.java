package com.bit;

public class Ex11 {
	
	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer();
		StringBuffer st2 = new StringBuffer("java");
		StringBuffer st3 = new StringBuffer("web");
		StringBuffer st4 = st2.append(st3); //st2가 javaweb 으로 바뀜. 객체 자체가 바뀜.
		StringBuffer st5 = st2.append("Freamwork");
		st2.append(st3);
		for (int i = 0; i < 51; i++) {
			st1.append('a');
		}
		st1.trimToSize(); //자주호출하면 좋지않다.?
		System.out.println(st1+":"+st1.capacity());
		
	}

}
