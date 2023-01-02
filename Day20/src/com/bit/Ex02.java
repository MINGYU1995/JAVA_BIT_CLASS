package com.bit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.omg.CORBA.portable.InputStream;

public class Ex02 {

	public static void main(String[] args) {
		File f = new File("text01.txt");
		FileInputStream is = null;
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bais = null;
		try {
		
			is = new FileInputStream(f);
			baos = new ByteArrayOutputStream();
			int su = -1;
			while((su=is.read())!=-1){
				baos.write(su);
			}
			
			byte[] arr = baos.toByteArray();
			bais = new ByteArrayInputStream(arr);
			su = -1;
			while((su=bais.read())!=-1) {
				System.out.println(su);
			}
			System.out.println(new String(arr));
			if(baos!=null)baos.close();
			if(is!=null)is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
