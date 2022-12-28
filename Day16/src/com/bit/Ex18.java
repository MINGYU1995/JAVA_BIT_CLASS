package com.bit;
import java.io.*;
public class Ex18 {

	public static void main(String[] args) {
		//
		File target = new File("Lec16.bin"); //read
		File result = new File("Lec18.txt");//write
		byte[] buf = new byte[10];
		InputStream is;
		OutputStream os;
		
		try {
		if(!result.exists())
				result.createNewFile();
			is = new FileInputStream(target);
			os = new FileOutputStream(result);
			while(true) {
				int su = is.read(buf);
				if(su==-1)break;
				os.write(buf);
			}
			os.close();
			is.close();
			System.out.println("복사완료");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	}
}
