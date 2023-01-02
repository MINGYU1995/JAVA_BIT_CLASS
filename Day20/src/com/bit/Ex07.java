package com.bit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex07 {

	public static void main(String[] args){
		Writer fw;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(new File("test07.txt"));
			pw = new PrintWriter(fw);
			
			pw.print(true);
			pw.print(1234);
			pw.print(3.14);
			pw.println();
			pw.println("문자열 메세지 작성");
			
			if(pw!=null)pw.close();
			if(fw!=null)fw.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} 
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(pw!=null)pw.close();
			if(fw!=null)fw.close();
		}
		
	
	}

}
