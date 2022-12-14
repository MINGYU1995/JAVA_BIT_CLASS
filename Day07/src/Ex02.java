/*
	배열
	자료형[] 배열명 = new 자료형[배열길이];
	호출 -> 배열명[인덱스]
	인덱스 법칙 
		1.  0부터 시작
		2. 연속됨
		3. 마지막 번호는 배열의길이 -1;
		4. ArayIndexOutBoundException배열 길이 허용범위 초과 
	배열의 길이 == 배열명.length
*/
//자바에서 배열의 목적은? 
class Ex02{

public static void main(String[] args){	//String type에 배열 하나의 문자열이 아니라 여러개의 문자열을 한번에 전달 받는.. 입력받기 위해
				// 실행시점에 입력 받으면 args의 값이 바뀌면서 실행된다. 저걸 적는 이유.. 
	int a1,a2,a3,a4,a5; //변수의 선언 
	int[] arr = new int[5];	
	arr[0]=1; // 1=1;
	arr[1]=3;	//a2=3;
	arr[2]=5;	//a3=5;
	arr[3]=7;	//a4=7;
	arr[4]=9;	//a5=9;
	for(int i=0; i<5; i++){
		arr[i] =1+2*i;

	}
	for(int i=0; i<5; i++){
		System.out.println(arr[i]);

	}
	
}
}