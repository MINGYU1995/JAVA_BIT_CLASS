package com.step01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {	//서버쪽에서는 소켓의 생성 방법이 다름
		Socket sock=null;
		ServerSocket serve=null;
		InetAddress inet=null;
		OutputStream os=null;
		InputStream is=null;
		try {
			serve=new ServerSocket(8080);	//8080포트를 열어놓고 대기	//소켓 서버 객체 생성 //포트번호 필요
			
			sock=serve.accept();	
			is=sock.getInputStream();
			os=sock.getOutputStream();
			int su=-1;
			while((su=is.read())!=-1) {
				os.write(su);
			}

			if(is!=null)is.close();
			if(sock!=null)sock.close();
			if(serve!=null)serve.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
