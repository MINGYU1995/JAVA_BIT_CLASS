package com.bit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03 {

	public static void main(String[] args) {
		File f = new File("text03.txt");
		Writer pw = null;
		char[] buff = "12345676tjfsdoifjsdoifsjffewf".toCharArray();
			try {
				if(!f.exists())f.createNewFile();
				pw = new FileWriter(f);
				for (int i = 'a'; i <= 'z'; i++) {
					pw.write(i);
				}
				pw.write("하나글로 잘 바로 잘 작성됨.");
				
//				pw.write('\uac00');
				if(pw!=null)pw.close();		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
