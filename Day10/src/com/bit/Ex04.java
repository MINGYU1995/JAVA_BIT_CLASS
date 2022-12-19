package com.bit;

public class Ex04 {
//수정과 삭제를 가지고 하는경우는 불편함.. index문제 
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
		String data = "";
//		System.out.print("총원>");
		//input = sc.nextInt();
		while(true) {
			System.out.print("1.리스트 2.입력 3.상세보기 0.종료>");
			input = sc.nextInt();
			if(input == 0)break;
			if(input == 1) {
				System.out.println("--------------------------");
				System.out.println("학번\tjava\tweb\tframework");
				System.out.println("--------------------------");
				System.out.println(data);
				System.out.println("--------------------------");
			}
			if(input == 2) {
				System.out.print("학번>"); //나랑 다르게 input이라는 int변수 안에 연속으로 값을 넣어준다?
				input = sc.nextInt();
				data += input+"\t"; //배열 크기를 만들어주고 그 공간에 해당 학번이라는 데이터를 넣는다.
				System.out.print("java>");
				input = sc.nextInt();
				data += input+"\t";
				System.out.print("web");
				input = sc.nextInt();
				data += input+"\t";
				System.out.print("freamwork");
				input = sc.nextInt();
				data += input+"\t";
			}
			if(input == 3) {
				System.out.println("학번>");
				input = sc.nextInt();
					String[] arr1 = data.split("\n");
					for (int i = 0; i < arr1.length-1; i++) {
						String[] arr2 = arr1[i].split("\t");
						if(arr2[0].equals(input+"")) {
							int sum = Ex02.inputSu(arr2[1])+Ex02.inputSu(arr2[2])+Ex02.inputSu(arr2[3]);
							System.out.println("합계:"+sum);
							break;
						}
					}				
				}
			}
		}
	}

