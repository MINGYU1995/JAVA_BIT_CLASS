package com.bit;

public class Ex08 {

	
	public static void func() {
		System.out.println("func start....");
		try {
			int a = 4;
			int b = 2;
			int c = a/b;
			System.out.println(c);	
			return;
		}finally { //반드시 수행해야할때 
			System.out.println("func end....");			
		}
	}
	public static void main(String[] args) {
		func();
		
	}

}
