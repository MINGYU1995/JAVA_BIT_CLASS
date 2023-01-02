package com.stu01;
import java.io.*;
import java.util.*;

import org.omg.CORBA.portable.InputStream;

public class Ex01 {

	public static void main(String[] args) {
		File f = new File("./src/com/stu01/data.bin");
		System.out.println("학생성적관리프로그램(ver0.5.0)");
		Scanner sc = new Scanner(System.in);
		int input = -1;
		while(true) {
			System.out.println("1.리스트 2.보기 3.입력 4.수정 5.삭제 0.종료");
			input = sc.nextInt();
			if(input == 0)break;
			if(input == 1) {
				System.out.println("-------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				if(f.exists()) {
				InputStream is = null;
				try {
				//	is = new FileInputStream(f);
					int cnt = 0;
					while(true) {
						cnt++;
						int su = is.read();
						if(su == -1)break;
						System.out.print(su+"\t");
						if(cnt%4==0)System.out.println();
					}
					
					if(is!=null)is.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else {
					System.out.println("존재하지 않습니다.");
				}
				
				System.out.println("-------------------------------------");
			}
			if(input == 2) {
				System.out.println("학번>");
				int num = sc.nextInt();
				FileInputStream is = null;
				
				try {
					is = new FileInputStream(f);
					while(true) {
						int su1 = is.read();
						if(su1 == -1)break;
						int su2 = is.read();
						int su3 = is.read();
						int su4 = is.read();
					if(num == su1){
						System.out.println("국어>"+su2);
						System.out.println("영어>"+su3);
						System.out.println("수학>"+su4);
					}
						
					}
					if(is!=null)is.close();
					}catch (FileNotFoundException e) {
						// TODO: handle exception
						e.printStackTrace();
					}catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
				
			}
			if(input == 3) {
				System.out.print("학번>");
				int num = sc.nextInt();
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				OutputStream os = null;
				FileInputStream is = null;
					
					try {		
						os = new FileOutputStream(f);
						if(!f.exists()) {
							f.createNewFile();
						}else {
							File temp = new File(f.getParent()+"/temp");
							os = new FileOutputStream(temp);
							is = new FileInputStream(f);
							while(true) {
								int su=is.read();
								if(su==-1)break;
								os.write(su);
								
							}
							if(os!=null)os.close();
							if(is!=null)is.close();
							is = new FileInputStream(temp);
							os = new FileOutputStream(f);
							while(true) {
								int su = is.read();
								if(su==-1)break;
								os.write(su);
							}
							if(is!=null)is.close();
							temp.delete();
						}
						
				
						os.write(num);
						os.write(kor);
						os.write(eng);
						os.write(math);
						os.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			}
			if(input == 4) {}
			if(input == 5) {}
		}

	}

}
