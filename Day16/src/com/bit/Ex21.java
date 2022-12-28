package com.bit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex21 {

	public static void main(String[] args) {
		String msg = "버퍼를 달아서 성능을 올립시다.";
		byte[] arr = msg.getBytes();
		File f = new File("Lec21.txt");
		OutputStream os;
			try {
				if(f.exists())
				f.createNewFile();
			os = new FileOutputStream(f);
			os.write(arr);		
			os.close();
			System.out.println("한번에 작성");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
