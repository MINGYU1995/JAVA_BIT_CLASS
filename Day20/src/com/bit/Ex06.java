package com.bit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex06 {

	public static void main(String[] args) {
		File f = new File("test04.txt");
		
		Reader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			//int su = -1;
//			while((su=br.read())!= -1) {
//				System.out.print((char)su);
//			}
			String msg = null;
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			if(br!=null)br.close();
			if(fr!=null)fr.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
