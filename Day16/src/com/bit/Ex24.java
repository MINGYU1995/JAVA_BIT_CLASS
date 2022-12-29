package com.bit;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
//스캐너 사용안한. 폴더정보 가져오기.
public class Ex24 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:MM");
		File file = new File("D:\\java\\JAVA_BIT_CLASS");
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
