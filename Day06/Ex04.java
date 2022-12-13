class Ex04{
public final static int SU2  = 2222; 
//public final static int SU2; // 0 인데 존재의미가 없다 오류남.
public final int SU3; // 0 인데 존재의미가 없다 오류남. non 도 해당됨. 초기화선언해줘야됨.

public Ex04(){
	SU3=3333;
}

public static void main(String[] args){
	final int SU = 1111; //final 상수형변수 고정이기 때문에 su에 에러가 난다.
	//SU = 2222;
	System.out.println(SU2);

}

}