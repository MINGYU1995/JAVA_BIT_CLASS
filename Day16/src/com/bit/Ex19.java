package com.bit;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex19 {

	public static void main(String[] args) {
		String msg = "한글도 잘 \t나옵니다";
		byte[] arr = msg.getBytes();
		InputStream is = System.in;
		OutputStream os = System.out;	
		int su = -1;
		//13 == \r
		//10 == \n
		try {
//			for (int i = 0; i < arr.length; i++) {
//			os.write(arr[i]);				
//			}
//			os.close();
			while(true) {
				su = is.read();
				if(su==-1) {break;}
				os.write(su);				
			}
			os.close();
			is.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



