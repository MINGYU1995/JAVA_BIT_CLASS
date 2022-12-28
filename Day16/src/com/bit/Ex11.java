package com.bit;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex11 {
//D:\java\JAVA_BIT_CLASS\Day16\src\com\bit
	public static void main(String[] args) {
		//d:\java 파라미터를 입력 받았을때 
		//JAVA_BIT_CLASS안에 파일/폴더 출력하기
		String path=".";
		if(args.length>0) {
			path = args[0];
		File file = new File(path);
		if(file.exists()) {
			String[] arr = file.list();
			for (int i = 0; i < arr.length; i++) {
				file = new File(arr[i]);
				long nalja=file.lastModified();
				Date d = new Date(nalja);
				SimpleDateFormat sdf = new SimpleDateFormat();
				String msg = sdf.format(d);
				System.out.println(msg+"\t");
				if(file.isDirectory()) {
					System.out.println("<DIR>"+"+");
				}
				//File file2 = new File(file.getParent()+"\\"+arr[i]);
				System.out.println(file.lastModified()+"\t");
				System.out.println(file.isFile());
//				if(file.isDirectory())
//				System.out.println("<DIR>"+ "\t\t");
//				else
//				System.out.println("\t"+file.length()+"\t");
				System.out.println(file.getName());
			}
		}
		}
		

	}

}
