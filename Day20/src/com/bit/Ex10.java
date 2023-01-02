package com.bit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex10 {

	public static void main(String[] args) {
		OutputStream os = null;
		OutputStreamWriter osw = null;
		Writer osw1 = null;
		try {
			os = new FileOutputStream("test08.txt");
			osw1 = new OutputStreamWriter(os);
			
			osw1.write("문자열 작성합니다.");
			
			
			if(osw1!=null)osw1.close();
			if(os!=null)os.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
