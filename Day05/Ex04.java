package com.my;
class Ex04{
/*		
static -> static			[클래스명.]메서드명(); //대괄호는 생략이 가능한의미
static -> non-static			참조변수.메서드();
non-static -> static			[클래스명.]메서드명();
non-static -> non-static		[this.]메서드명();


*/
public static void main(String[] args){
	func01();
	Ex04 me = new Ex04(); //Ex04(); 얘가 func02를 들고있으니깐. 레퍼런스값 me 를 만들어줌.
	me.func02();	//참조변수로 접근 
}

public static void func01(){
	System.out.println("static methond func01().");
}

public void func02(){
	System.out.println("non-static method func02()");
	func03();
}
public void func03(){
	System.out.println("non-static method func03()");
}
}