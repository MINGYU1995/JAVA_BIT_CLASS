package com.step03;
//다중의 사용자
//서버
import java.net.*;
import java.io.*;

public class Server extends Thread{
	Socket sock;
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		
		
		try {
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			
			while(true) {
				int su=is.read();
				if(su==-1)break;
				os.write(su);
			}
			
			
			if(os!=null)os.close();
			if(is!=null)is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerSocket serve=null;
		
		
		try {
			serve=new ServerSocket(8080);
			while(true) {
				Socket sock=serve.accept(); //무한루프로 계속 accept하게끔		//socket을 반환
				Server me=new Server(sock);//Thread를 상속할지 여기서 만들지 정해서 
				me.start();		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
