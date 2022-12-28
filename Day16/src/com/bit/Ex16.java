package com.bit;
import java.io.*;
//쓰기 OutputStream
public class Ex16 {

	//사람 > 파일 OutputStream 쓰기
	//파일 > 사람 InputStream 읽어오기
	
	public static void main(String[] args) {
		String msg = "한";
		byte[] arr = msg.getBytes();
		File f = new File("Lec16.bin");
		OutputStream os;
		try {
			if(!f.exists())f.createNewFile();
			os = new FileOutputStream(f);
			os.write('a');
			os.write('b');
			os.write('c');
			os.write('d');
			//os.write(65); //1byte로 65를 적은것 8bit값에 해당하는 65를 적어낸것
			os.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
