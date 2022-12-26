package com.bit;
//에러객체 만들기? 
class MyErr extends Exception{
	MyErr(){
		super("내가 정한 메세지");
	}        
}
public class Ex14 {

	public static void main(String[] args) {
		try {
		func(4,4);	
		}catch(Exception e) {
			System.out.println("에러 받아서 처리");
			e.printStackTrace();
//		}catch(ClassNotFoundException e) {
//			System.out.println("던진 에러받아서 처리");
		}
	}
	public static void func(int a, int b) throws MyErr{
		if(a/b==1) {
			MyErr myErr;
			myErr = new MyErr();
			throw myErr;
		}	
		int su=a/b;
	}
}
