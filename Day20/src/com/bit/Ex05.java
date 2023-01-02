package com.bit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex05 {

	public static void main(String[] args) {
		File f = new File("test04.txt");
		Writer fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
	 	     
			bw.write("문자열 버퍼를 이용해 작성할 예정입니다.");
			bw.flush(); //버퍼에 꽉 차지 않더라도 밀어냄.
			//bw.write("\r\n");
			bw.newLine();
			bw.write("또한 줄 작성하겠습니다.");
			
			if(bw!=null)bw.close();
			if(fw!=null)fw.close();
			
			System.out.println("작성완료");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			

	}

}
