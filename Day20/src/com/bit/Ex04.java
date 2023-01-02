package com.bit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) {
		File f = new File("text03.txt");
		Reader fr = null;
		char[] buff = new char[8];

		try {
			fr = new FileReader(f);		
			while(true) {
				int su = fr.read(buff);
				if(su==-1)break;
				String msg = new String(buff,0,su);
				System.out.print(msg);
			}
			if(fr!=null)fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
