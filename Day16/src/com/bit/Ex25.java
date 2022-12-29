package com.bit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//D:\java\JAVA_BIT_CLASS\Day16\bin>java com.bit.Ex24


//폴더경로 스캐너  받아서 파일정보 받아오기 .

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc;
		while (true) {
			sc = new Scanner(System.in);
			System.out.print("dir>");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:MM");
			String input = sc.nextLine();
			File file = new File(input);
			String result = "";
			if (file.exists()) {
				if (file.isDirectory()) {
					File[] files = file.listFiles();
					for(File f : files) { 
						Date date = new Date(f.lastModified());
						result += sdf.format(date) + "\t";
						if (f.isDirectory()) {
							result += "<DIR>\t";
						} else {
							result += "\t";
						}
						result += f.length() + "\t";
						result += f.getName();
						result += "\r\n";
					}
					System.out.println(result);
				} else {
					Date date = new Date(file.lastModified());
					result += sdf.format(date) + "\t";
					if (file.isDirectory()) {
						result += "<DIR>\t";
					} else {
						result += "\t";
					}
					result += file.length() + "\t";
					result += file.getName();
					System.out.println(result);
				}
			} else {
				System.out.println("존재하지않는 파일 경로 입니다.");
			}
		}

	}

}
