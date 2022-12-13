class Lec03{	
	//클래스의 구성요소 
	//3.생성자
	//public 클래스명(매개변수){실행코드;return;} //return 값이 없다. 참조변수가 받아버리니깐. 리턴값이 정해져있는것.
	//객체 생성시점에 하고자 하는 일 명시 
	//객체 생성시 단 한 번만 호출가능
	//생성자를 정의 하지 않을시 디폴트생성자가 자동생성

	//public Lec03(){} 생성자가 없는 경우에 이런식으로 처리해버림

	//public Lec03(int su){ //매개변수를 찾을수가 없다. default 생성자가 없다는 오류가 나옴.,
	//	System.out.println("객체 생성"+su);
	//}//main 서 매개변수 값을 주지 않을시.
	
	public final int su2;

	public Lec03(){
		su2=2222;
		System.out.println("디폴트 생성자 호출");
		

	}

	public Lec03(int su){ //매개변수를 찾을수가 없다. default 생성자가 없다는 오류가 나옴.,
		su2=su;
		System.out.println("객체 생성"+su2);
	}	//상수변수이지만 객체를 찍어낼때마다 다르게 줄수 있음 객체별로 고정된 상수형 변수 
	
}


class Ex03{
	//public Ex03(){} 컴파일시 자동 생성됨.

public static void main(String[] args){
	Lec03 you;	// 주소의 패턴 0x0000~0xffff 메모리 주소 공간확보 범위.
	//you = null ;// defalut 값은 널이다. // new Lec03(); //무조건 정의를 해줘함.
	you = new Lec03(1111);
	System.out.println(you.su2);
	you = new Lec03(2222);
	System.out.println(you.su2);
	System.out.println(you); //Lec03@15db9742

	
}
}