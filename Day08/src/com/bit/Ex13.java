package com.bit;

public class Ex13 {

	//다음에 배열에 값을 +2씩하고 출력하라
	//int[] su1={1,4,6,7,9}
	//0~10중 홀수을 담는 배열을 생성하고 출력하시오.
	//알파벳 대문자를 담는 배열을 만들고 출력하시오
	//다음을 오름차순 정렬 출력하시오.
	//int[] su4={9,10,20,7,2,4,8,3}
	public static void main(String[] args) {
	int[] su1 = new int[] {1,4,6,7,9};
	int[] holsu = new int[11]; //홀수 담을 변수
	char[] alp = new char[26]; //알파벳 대문자 담는 변수
	int[] asc = new int[] {9,10,20,7,2,4,8,3,0,0}; //7
	int holsu2 =0;
	int tmp=0;
	
	
	for (int i = 0; i < su1.length; i++) {
		su1[i]+=2;
		System.out.print(su1[i]+" ");
	}
	System.out.print("1번------------------\n");
	for (int i = 0; i < 11; i++) {
		holsu2++;
		if(holsu2%2!=0) {
			holsu[i]+=holsu2;
			System.out.print(holsu[i]+" ");
		}
	}
	//알파벳 대문자를 담는 배열을 만들고 출력하시오
	//char[] alp = new char[10];
	System.out.print("2번------------------\n");
	for (int i = 0; i < alp.length; i++) {
		alp[i]+=(char)i+65;
		System.out.print(alp[i]+" ");
	}
	System.out.print("3번------------------\n");
	
	for (int i =0; i<asc.length-1; i++) {
		for(int j=0; j<asc.length-1-i; i++) {
			
			if(asc[j]>asc[j+1]) {
				tmp = asc[j];
				asc[j] = asc[j+1];
				asc[j+1] = tmp;
			}
		}
	}
	for (int i = 0; i < asc.length-1; i++) {
			System.out.print(asc[i]+" ");
	}
	
	}

}
