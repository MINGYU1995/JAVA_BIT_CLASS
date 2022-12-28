package com.bit;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class Ex07 { //데이타스트링
	public static void main(String[] args) {
		File f = new File("lec06.bin");
		InputStream is = null;
		DataInputStream dis = null;
		try {
			if(f.exists()) {
				is = new FileInputStream(f);
				dis = new DataInputStream(is);
				int su1 = dis.read();
				int su2 = dis.readInt();
				double su3 = dis.readDouble();
				char su4 = dis.readChar();
				boolean boo = dis.readBoolean();
				
				String msg = dis.readUTF();
				System.out.println(su1);
				System.out.println(su2);
				System.out.println(su3);
				System.out.println(su4);
				System.out.println(boo);
				System.out.println(msg);
			}	
			if(is!=null)is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
