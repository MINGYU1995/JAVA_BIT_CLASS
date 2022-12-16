package com.bit;
class Lec04{
	int su1 = 1111;
	public void func01() {
		System.out.println("root 기능");
	}
}
//클래스가 존나 많을 때 효율적일듯.
class Lec44 extends Lec04{
	void func44() {
		System.out.println("func44에요");
	}

}
class Lec444 extends Lec04{}


public class Ex04 extends Lec04{

	//메서드 오버라이드 - 메서드만 - 부모의 기능을 자식을 재작성
	//접근제한자는 같거나 보다 열리는 방향으로만 허용
	//오버라이드의 조건은 같아야
	@Override //오버라이드 명시해줌 어노테이션으로 .. 서로 override관계없으면 빨강불
	public void func01() {
		System.out.println("sub function...");
	}
	
	public String toString() {
		return "나야나";
	}
	public boolean equals(Object obj) {
		return 0==this.su-((Ex04)obj).su; //su에 접근하기 위해 강제 캐스팅.
	}
	int su;
	public Ex04(int su) {
		this.su=su;
	}
	public static void main(String[] args) {
		Ex04 me = new Ex04(1);
		Ex04 you = new Ex04(1);
		//me.func01(); //부모자식 클래스안에 같은 이름의 메서드가 존재할때 나의 메서드가 실행됨.우선.
	//	System.out.println(me==you); //이거 서로 참조하는 곳이 다르기 때문에 false
		System.out.println(me.equals(you)); //

	}
}
