package com.bit;

import java.util.*;

public class Ex14 {

	public static void main(String[] args) {
		Set lotto = new HashSet();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		Iterator ite = lotto.iterator();
		while(ite.hasNext()) System.out.println(ite.next());
	}

}
