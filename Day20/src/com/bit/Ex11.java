package com.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.InputMap;
import org.omg.CORBA.portable.InputStream;

public class Ex11 {

	public static void main(String[] args) {
		FileInputStream is = null;
		Reader isr = null;
		try {
			is = new FileInputStream("test08.txt");
			isr = new InputStreamReader(is);
			int su = -1;
			while((su=isr.read())!=-1) {
				System.out.println((char)su);
			}
			if(isr!=null)isr.close();
			if(is!=null)is.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		

	}

}
