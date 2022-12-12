package com.my;
//클래스의 이름은 첫글자 대문자 영문으로 시작
//영문숫자 조합에 띄어쓰기 불가
class Ex02{
// 클래스의 구성요소
//1.메서드 
// public static void (return값의)자료형 메서드명(매개변수){실행코드;}
//메서드명(매개변수값....);을 통해 호출
//단 호출에 있어 매개변수의 갯수와 타입이 모두 
//일치해야만 호출가능
//메서드의 이름은 원칙적으로 중복 불가능
//단, 일부허용 -> 메서드 오버로드(이름이 같은메서드) 왜?중복하여 처리하냐 편하게 사용하기 위해.
		//매개변수의 유무,타입,갯수가 서로다른 경우 나머지는 오버로드x
		//오버라이딩 = 상속
//컴파일러가 소스코드를 봤을때 필요한 코드가 없으면 자동으로 작성해줌.


public static void main(String[] args){
	System.out.println("시작");
	int a=1111; //이친구의 라이프사이클은 이 메서드 마지막 중괄호까지.
	func01(2222); // 어느 메소드인지 구분하기 힘듬.
	System.out.println("종료"+a);
	for(int i = 0; i < 5; i ++){//while 또한 //1.i의 라이프 사이클은
		System.out.println(i);
	} //2.여기까지.


}	//변수 lifeCycle 이다 
	//return value의 타입을 결정하는 
public static void func01(int a){ //이 매개변수의 값은 메서드 첫줄에 있는 변수값이다.
	System.out.println("a="+a);
	return;	
}

}