package com.step02;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		String url="127.0.0.1";
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;	//문자열로 바꿈
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		PrintWriter pw=null;
		Scanner sc=new Scanner(System.in);
		try {
			sock=new Socket(url,port);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			pw=new PrintWriter(osw);
			String msg=null;
			while(true) {
				System.out.print(">");
				msg=sc.nextLine();
				if(msg.equals("end"))break;		//클라이언트가 종료하면
				pw.println(msg);
				pw.flush();		//버퍼가 꽉차지않아도 flush()로 밀어내야함
				msg=br.readLine();
				System.out.println(msg);
			}
			
			if(os!=null)os.close();
			if(is!=null)is.close();
			if(sock!=null)sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
