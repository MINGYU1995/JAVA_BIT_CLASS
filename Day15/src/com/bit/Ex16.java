package com.bit;
import java.util.*;
public class Ex16 {

	public static void main(String[] args) {
		java.io.InputStream inn = System.in;
		Scanner sc;
		sc = new Scanner("12\n34");
		System.out.println(sc.nextInt()+1);
		System.out.println(sc.next()+1); //nextInt 랑 똑같다. 
		System.out.println(sc.nextLine()+1);
		//System.out.println(sc.hasNext()+1); 
		
		}	

}
