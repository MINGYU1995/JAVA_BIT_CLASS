package com.bit;
import java.util.*;
class Test implements Comparable {
	int val = 0; //기준이 되는 변수
	
	public Test(int oneNum) {
		val = oneNum;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return ((Test)o).val-val; //내림차순
	}
	public String toString() {
		// TODO Auto-generated method stub
		return ""+val;
	}
	
}


public class Ex13 {

	public static void main(String[] args) {
		//로또..6개의 번호 랜덤 출력.
		//음수면 좌측 양수면 우측
		Set set = new TreeSet();
		int[] lotto = {8,5,6,2,1,2};
		for (int i = 0; i < lotto.length; i++) {
			set.add(new Test(lotto[i]));
		}
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object obj = ite.next();	
			System.out.println(obj.toString());
		}
	}

}
