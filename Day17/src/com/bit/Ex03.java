package com.bit;
//필터클래스를 제공하는 버퍼
import java.io.*;
public class Ex03 {

	public static void main(String[] args) {
		String msg = "ABCDEFG HIJKLMN";
		File f = new File("lec03.bin");
		BufferedOutputStream bos =null;
		OutputStream os = null;
			try {
				if(f.exists())f.createNewFile();
				os = new FileOutputStream(f);
				bos = new BufferedOutputStream(os);
				for (int i = 0; i < msg.length(); i++) {
					bos.write(msg.charAt(i));					
				}
				if(bos!=null)bos.close();
				if(os!=null)os.close();
				System.out.println("끝");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
