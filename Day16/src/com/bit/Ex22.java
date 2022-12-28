package com.bit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex22 {

	public static void main(String[] args) {
		
		File f = new File("Lec21.txt");
		byte[] arr = new byte[1024];
		InputStream is;
		try {
			is = new FileInputStream(f);
			while(true) {
				int su = is.read(arr);
				if(su==-1)break;
				System.out.println(new String(arr));
			}
			is.read(arr);
			is.close();
			System.out.println(new String(arr));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
