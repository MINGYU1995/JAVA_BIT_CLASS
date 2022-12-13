package com.bit;

//접근제한자(class > 생성자, 전역변수, 메서드)
//public 	- 어디서든 접근 허용
//default 	- 동일 패키지만 접근을 허용
//private	- 외부에서 접근 불가능
////////////////////
//class - public , default
//전역변수, 메서드 - public , default, private


class Ex09{ // 안에 public 메서드를 사용하더라도 클래스 자체가 public이 아니면 접근 못함. 
	//private Ex09(){} //객체 생성하는 것 자체를 막아버릴 수 있다. 

public static Ex09 me = new Ex09(); //외부에선 객체를 못찍는데? 자연스럽게 싱그톤 패턴이됨.필드자체로. Ex09.me 로 객체 받음.
//null 주입 가능 대신 못씀.. 치명적인 단점 BUt. 필드에 직접 접근을 못하게 하면 됨.
private static Ex09 me = new Ex09(); //객체를 프라이빗으로 찍어서 밑에 메서드를 통해 호출함.
public static Ex09 newInstance(){ //자바의 장점 캡슐화 정보은닉.
	return me;
}//굳이 왜 이렇게? 


public static void main(String[] args){
	//System.out.println(com.bit2.Ex10.su1);
	//System.out.println(com.bit2.Ex10.su2);
	//System.out.println(Ex10.su3);
	com.bit2.Ex10.func01();
	com.bit2.Ex10 ex;
	ex = new com.bit2.Ex10(1,
		//com.bit.Ex10.func02(); //com/bit2/Ex10 파일 안에 func01에 함수출력.

}
}