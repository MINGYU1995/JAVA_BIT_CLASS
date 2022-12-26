package com.bit;
//익명클래스는 여러번 쓴다. 한번만 쓰고 말거면 .. 객체 한번만 생성 
interface Inter{
	void func();
	
}
abstract class Lec05{
	void func02() {
		System.out.println("추상클래스의 기능");
	}
	public abstract void func();
}
class Lec55{
	public void func() {
		System.out.println("본래 기능.");
	};
}

class Outter05{
	static void func01() { //이름없는 클래스
		Lec55 obj =new Lec55(){
			public void func(){
				System.out.println("익명클래스만들기");
			}						
		};
		obj.func();
	}
}
//		(new (){
//		}).func();
public class Ex05 {

	public static void main(String[] args) {
		//System.out.println(Outter05.func01());//.func();
		//Outter05.func01().func();
	}

}
