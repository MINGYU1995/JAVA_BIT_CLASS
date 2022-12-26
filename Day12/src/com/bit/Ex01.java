package com.bit;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {

		System.out.println("로또번호생성기(ver 0.1.0)");
		int su = 10;
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*su)+1;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
