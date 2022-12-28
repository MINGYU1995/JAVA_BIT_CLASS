package com.bit;
import java.io.*;
import java.util.*;

public class Ex20 {
	//해당 특정 경로에 파일에 내용을 inputStream으로 받아와 출력하는 코드.
	
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\\java\\JAVA_BIT_CLASS\\Day16\\.classpath");
		InputStream is = new FileInputStream(f);
		Scanner sc = new Scanner(is);
		
		while(sc.hasNext()) {
			String msg = sc.nextLine();
			System.out.println(msg);			
		}
		//msg = sc.next();
		//System.out.println(msg);
		

	}

}
