package com.bit;

import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new Vector(); //동적 배열을 제공하고, 표준 배열보다 느리지만 많은 움직임이 필요한 프로그램에서 유용합니다
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		Iterator ite = ((Vector)list).iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}

}
