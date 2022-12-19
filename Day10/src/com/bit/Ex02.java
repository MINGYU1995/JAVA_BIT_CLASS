package com.bit;
public class Ex02 {
//4개단위로 묶어서 조정가능.
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
		System.out.print("총원>");
		input = sc.nextInt();
		int[][] data = new int[input][];
		int cnt = 0;
		while(true) {
			System.out.print("1.리스트 2.입력 3.상세보기 0.종료>");
			input = sc.nextInt();
			if(input == 0)break;
			if(input == 1) {
				System.out.println("-------------------------");
				System.out.println("학번\tjava\tweb\tframework");
				System.out.println("-------------------------");
				for (int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					if(stu == null)break;
					System.out.println(stu[0]+"\t" + stu[1]
								+"\t"+stu[2]+ "\t"+ stu[3]);			
				}
				System.out.println("-------------------------");
			}
			if(input == 2) {
				int[][] before = data;
				data = new int[data.length+1][];
				System.arraycopy(before, 0, data, 0, before.length);
				int[] stu = new int[4];
				stu[0] = inputSu("학번>");
				stu[1] = inputSu("java>");
				stu[2] = inputSu("web>");
				stu[3] = inputSu("framework>");
				data[cnt++] = stu;
			
				//System.out.println("학번>"); //나랑 다르게 input이라는 int변수 안에 연속으로 값을 넣어준다?	
			}
			if(input == 3) {
				System.out.println("학번>");
				input = sc.nextInt();
				for (int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					if(input == stu[0]) {
						System.out.println("합계:"
								+(stu[1]+stu[2]+stu[3]));
						System.out.println("평균:"
								+(stu[1]+stu[2]+stu[3])*100/3/100.0);
						char ch = 'F';
						if((stu[1]+stu[2]+stu[3])>=3*90)ch = 'A';
						else if((stu[1]+stu[2]+stu[3])>=3*80)ch = 'B';
						else if((stu[1]+stu[2]+stu[3])>=3*70)ch = 'C';
						else if((stu[1]+stu[2]+stu[3])>=3*60)ch = 'D';
						System.out.println("학점:" + ch);
						break;
					}
				}
			}
		}
	}
	public static int inputSu(String msg) {
		//문자열(숫자)을 입력하는데 숫자가 아닌입력이 있으면 어떻게? 입력자체를 문자열로.. 문자열 검사를 할수 있다. 
		//숫자로만 구성되어있으면 ok 아니면 재입력..
		int sum = 0;
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		System.out.println(msg);
		String input = sc.nextLine();
		if(input.length() <= 3) {
			boolean boo = true;
			for(int i=0; i<input.length(); i++) { //숫자로만 구성되어있냐?
				if(input.charAt(i)<'0' || input.charAt(i)>'9') {
					boo=false;
				}
			}
			if(boo) { //문자가 들어가면 false가 됨.
				//숫자로 구성된 문자열을 (int)숫자로 변환.
			int m=0;
			int n=1;
	
			for (int i = input.length()-1; i>=0; i--) {
				for(int j=0; j<m; j++) {n*=10;}
				sum+=(input.charAt(i)-'0')*n;m++;
			}
		}else {
		return inputSu(msg); //숫자를 받을때까지 반복을 하기 위한 재귀함수.
		}
	}
		return sum;
}
}
