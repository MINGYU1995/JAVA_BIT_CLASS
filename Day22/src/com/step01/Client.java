package com.step01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {	//객체의 생성이 곧 접속
	
	public static void main(String[] args) {
		byte[] arr= {(byte)192,(byte)168,(byte)240,(byte)65};
		InetAddress addr=null;
		int port=8080;
		java.net.Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		try {
			addr=InetAddress.getByAddress(arr);
			sock=new Socket(addr,port);
			os=sock.getOutputStream();

			is=sock.getInputStream();
//			os.write(65);
//			System.out.println(is.read());
//			os.write(66);
//			System.out.println(is.read());
//			os.write(67);
//			System.out.println(is.read());
			os.write("Hi server..".getBytes());
			int su=-1;
			while((su=is.read())!='.') {//파일에서는 파일 사이즈로 끝지점을 알수있는데	//통신에서는 끝점이 불명확함 
				
				System.out.print((char)su);
			}
			if(os!=null)os.close();
			if(is!=null)is.close();
			if(sock!=null)sock.close();			//소켓도 io라서 close()해야함
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
