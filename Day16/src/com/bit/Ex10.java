package com.bit;
import java.io.*;
import java.sql.Date;
import java.util.Arrays;
public class Ex10 {

	public static void main(String[] args) {
		//File file = new File(".\\Lec01.txt");
		File file = new File("D:\\java\\JAVA_BIT_CLASS\\Day16\\src\\com\\bit");
		
		
		System.out.println("유무?"+file.exists());
		if(file.exists()) {
			System.out.println(" dir?"+ file.isDirectory());
			System.out.println("file?"+ file.isFile());
			System.out.println("경로:"+file.getPath());
			System.out.println("위치:"+file.getParent());
			System.out.println("파일이름:"+file.getName()); //위치와 이름을 합치면 경로죠
			System.out.println("절대경로:"+file.getAbsolutePath());
			try {
				System.out.println("진짜절대경로:"+ file.getCanonicalPath());
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("r:"+file.canRead());
			System.out.println("w:"+file.canWrite());
			System.out.println("x:"+file.canExecute());
			System.out.println("size:"+file.length()+"byte");
			System.out.println(new Date(file.lastModified()));
			String[] arr = file.list();
			System.out.println(Arrays.toString(arr));
		}
	}

}
