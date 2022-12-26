package com.bit;
import java.util.ArrayList;
public class Ex05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		ArrayList list2 = new ArrayList();
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
		//list2.remove(1); //index가 지워짐
		list2.set(1,5555);
		Object[] arr3 = list2.toArray();
		for (int i = 0; i < list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println(list2.contains(4444));
	}
}
