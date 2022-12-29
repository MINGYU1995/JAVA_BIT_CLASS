package com.bit;

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex23 {

	public static void main(String[] args) { //클래스파일 뒤에 들어오는 입력값.
		// dir만들기
		String path = ".";
		if(args.length>0)
				path = args[0];
		File file = new File(path);
		if(file.exists()) {
			String[] arr = file.list();
			for (int i = 0; i < arr.length; i++) {
				file = new File(arr[i]);
				long naljs = file.lastModified();
				Date d = new Date(naljs);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				
				String msg = sdf.format(d);
				System.out.println(msg + "\t");
				if(file.isDirectory())
					System.out.println("<DIR>"+"\t\t");
				else
					System.out.println("\t"+file.length()+"\t");
					System.out.println(file.getName());
			}
			
			
		}

}
}