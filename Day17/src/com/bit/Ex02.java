package com.bit;
import java.io.*;
public class Ex02 { //이코드만 기억하면 i/o 상황에서 사용할 수 있다. 

	public static void main(String[] args) {
		File f = new File("lec01.bin");
		File copy = new File("copy.bin");
		byte[] buf = new byte[2]; //버퍼의 크기가 클수록 큰파일을 복사하는데 빠른시간이 걸림.
		InputStream is = null;
		OutputStream os = null;
		try {               
			if(f.exists()) {
				is = new FileInputStream(f);
				if(!copy.exists())copy.createNewFile();
				os = new FileOutputStream(copy);
				while(true) {
					int su = is.read(buf);  
					if(su==-1)break;
					os.write(buf,0,su);					
				}
			}
			if(os!=null) os.close();
			if(is!=null) is.close();
			System.out.println("복사완료");
		}catch(FileNotFoundException e) {
			e.printStackTrace();   
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
