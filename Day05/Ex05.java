/*
클래스의 구성요소
2. 변수
	1.static변수 -클래스 변수
	2.non-static변수 - [멤버]필드
call
static -> static			[클래스명.]변수명; //대괄호는 생략이 가능한의미
static -> non-static			참조변수.변수명;
non-static -> static			[클래스명.]변수명;
non-static -> non-static		[참조변수.]변수명;
특징
	1.전역변수의 특성..
	2.초기화없이 사용가능..
	3.default값이 존재....(자동초기화) & 초기값을 안주면 0으로 초기화한다는뜻.
	4.defalut값을 사용하든, 선언과 초기화가 동시에 
*/
class Ex05{

public static int su1=1111;
public int su2=2222;
public static void main(String[] args){
	Ex05 me;
	//me = new Ex05(); //한번 초기화 하기 때문에 2221,2222,2223,4'''5'''6'''
	for(int i=0;i < 5; i++){
	 //참조변수는 최대한 반복문 넣어서 사용하지 말것.
	me = new Ex05(); //매번 2222초기값을 하기 때문에 2222,2222,2222,
	me.su2++;
	me.func01();	//가리키기만 했지 지정은 안했기 때문에 출력은 0이 나온다. 
}


}
public void func01(){
	System.out.println(su2);
}
}