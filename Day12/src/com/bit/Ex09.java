package com.bit;

public class Ex09 {

	public static void main(String[] args) {
		char ch1 =' ';
		Character ch2 = new Character('A');
		Character ch3 = new Character((char)65);
		System.out.println();

		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.isAlphabetic(ch1));
		System.out.println(Character.isDigit(ch1));
		
		System.out.println(Character.isSpace(ch1));
		System.out.println(Character.isWhitespace(ch1));
		System.out.println(Character.isUpperCase(ch1));
		System.out.println(Character.isLowerCase(ch1));
		
		
		} 

}
