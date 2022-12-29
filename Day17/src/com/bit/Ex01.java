package com.bit;
import java.io.*;
public class Ex01 {

	public static void main(String[] args) {
		String msg = "abcdefg hijklmn";
		byte[] buf = new byte[2];
		File f = new File("lec01.txt");
		OutputStream os;
		
		try {
			os = new FileOutputStream(f);
			
			for (int i = 0; i < msg.length(); i++) {
				os.write(msg.charAt(i));
			}
			
			os.close();
			System.out.println("완작성료");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
