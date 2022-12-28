//package com.bit;
//
//public class Ex03 {
//	static int su1 = 1111;
//	int su2 = 2222; //객체를 찍어내야 힙영역 할당.
//	
//	class Inner03{
//		final static int su3 = 3333;
//		int su4 = 4444;
//		Inner03(){}
//		void func04() {
//			System.out.println(su1);
//			System.out.println(su2);
//			func01();
//			func02();
//			
//		}
//		final static fucn03() {}
//	}
//	Outter3(){}
//	
//	static void func10() {
//		System.out.println(Inner.su3);
//		Inner03 = inn = new inner03();
//	}
//	static void func01() {
//		System.out.println(Inner03.su3);
//		Outter03 outt = new Outter();
//		Innner03 inn = outt.new Inner03();
//		System.out.println(inn.su4);
//		inn.func04();
//	}
//	void func02() {
//		System.out.println(Inner03.su2);
//	}
//
//	public static void main(String[] args) {
//		////
//		System.out.println(Ourrter03.Inner03.su3);
//		Outter03 outt = new Outeer03();
//		Outter03.Inner03. inn;
//		inn = new Outter03.Inner03();
//		System.out.println(inn.su4);
//		inn. func04();
//
//	}
//
//}
