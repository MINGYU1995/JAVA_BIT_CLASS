package com.bit;

public class Ex01 {
//수정과 삭제를 가지고 하는경우는 불편함.. index문제 
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
//		System.out.print("총원>");
//		input = sc.nextInt();
		int[] data = new int[input*4];
		int cnt = 0;
		while(true) {
			System.out.print("1.리스트 2.입력 3.상세보기 0.종료>");
			input = sc.nextInt();
			if(input == 0)break;
			if(input == 1) {
				System.out.println("-------------------------");
				System.out.println("학번\tjava\tweb\tframework");
				System.out.println("-------------------------");
				for(int i = 0; i < data.length; i++) {
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i]);
					System.out.print('\n');
				}
				System.out.println("-------------------------");
			}
			if(input == 2) {
				int[] before = data;
				data = new int[data.length+4];
				System.arraycopy(before, 0, data, 0, before.length);
				System.out.print("학번>"); //나랑 다르게 input이라는 int변수 안에 연속으로 값을 넣어준다?
				input = sc.nextInt();
				data[cnt++] = input; //배열 크기를 만들어주고 그 공간에 해당 학번이라는 데이터를 넣는다.
				System.out.print("java>");
				input = sc.nextInt();
				data[cnt++] = input;
				System.out.print("web");
				input = sc.nextInt();
				data[cnt++] = input;
				System.out.print("freamwork");
				input = sc.nextInt();
				data[cnt++] = input;
			}
			if(input == 3) {
				System.out.println("학번>");
				input = sc.nextInt();
				for(int i = 0; i < data.length; i+=4) {
					if(data[i] == input) {
						int sum = data[++i]+data[++i]+data[++i];
						double age=sum*100/3/100.0;
						char ch = 'F';
						if(sum >= 27)ch ='A';
						else if(sum >= 3*80)ch = 'B';
						else if(sum >= 3*70)ch = 'C';
						else if(sum >= 3*60)ch = 'D';
						
						System.out.println(input+ "학번 합계:"+sum);
						System.out.println(input+ "학번 평균:"+age);
						System.out.println(input + "학번 학점:");
						break;
					}
				}
				System.out.println(input + "학번의 합계, 평균, 학점");
			}
		}
	}

}
