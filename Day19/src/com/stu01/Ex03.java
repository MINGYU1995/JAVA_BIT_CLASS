package com.stu01;

import java.io.*;
import java.util.*;
//자료구조에 찾아서 수정과 삭제를 이루어지면된다 . . 
public class Ex03 {
	public static void init() {
	public static void main(String[] args) {
		List<int[]> data = new ArrayList<>();
		System.out.println("학생성적관리프로그램(ver 0.5.2");
		Scanner sc = new Scanner(System.in);
		
		File f = new File("./src/com/stu03/data.bin");
		int input = -1;
		init();
		while(true) {
			System.out.println("1.리스트 2.보기 3.입력 4.수정 5.삭제 0.종료");
			input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("-------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------");
				if(f.exists()) {
					InputStream is = null;
					ArrayList<Byte> arr2 = new ArrayList<Byte>();
					
					try {
						is = new FileInputStream(f);
						while(input=is.read()! = -1)
						if(is!=null)is.close();
					}catch (FileNotFoundException e) {
						e.printStackTrace();
					}catch (IOException e) {
						e.printStackTrace();
					}	
					
					Object[] arr3 = arr2.toArray();
					Byte[] arr4 = new Byte[arr3.length];
					
					for (int i = 0; i < arr3.length; i++) {
						arr4[i] =(byte) arr3[i];
					}
					
					String msg = new String(arr4);
					if(!msg.isEmpty()) {
							msg = msg.substring(1,msg.length()-1);
							String[] arr5 = msg.split("][");
							for (int i = 0; i < arr5.length; i++) {
								String stu = arr5[i];
								String[] arr6 = stu.split(",  ");
								int[] arr7 = new int[arr6.length];
								for (int j = 0; j < arr7.length; j++) {
									arr7[j]= Integer.parseInt(arr6[j]);
								}		
					}
				}
				System.out.println("------------------------------------------");
			}
			if(input == 2) {}
			if(input == 3) {
				int[] stu = new int[4];
				System.out.print("학번>");
				stu[0] = sc.nextInt();
				System.out.print("국어>");
				stu[1] = sc.nextInt();
				System.out.print("영어>");
				stu[2] = sc.nextInt();
				System.out.print("수학>");
				stu[3] = sc.nextInt();
				data.add(stu);
				OutputStream os = null;
				try {
					if(!f.exists())f.createNewFile();
					os = new FileOutputStream(f);
					for (int i = 0; i < data.size(); i++) {
						int[] arr = data.get(i);
						os.write(Arrays.toString(arr).getBytes());
					}
					
					if(os!=null)os.close();
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
			if(input == 4) {}
			if(input == 5) {}
			
			System.out.println("1");
		}

	}
	}
}
