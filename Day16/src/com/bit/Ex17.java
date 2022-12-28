package com.bit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//읽기 InputStream
//메모장은 글자를 표현해주는 프로그램이라 바이너리 코드를 -> 문자로
public class Ex17 {
	public static void main(String[] args) {
		File f = new File("Lec16.bin");
		InputStream is;
		if(f.exists()) {
			try {
				is = new FileInputStream(f);
				int su = -1;
				while(true) {
					su = is.read();
					if(su==-1)break;
					System.out.println(su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}
