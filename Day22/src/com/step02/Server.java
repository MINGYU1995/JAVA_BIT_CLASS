package com.step02;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;		//readline가능
		PrintWriter pw=null;
		try {
			serve=new ServerSocket(8080);
			sock=serve.accept();
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			pw=new PrintWriter(osw);
			
			String msg=null;
			while((msg=br.readLine())!=null) {
				pw.println("re : "+msg);
				pw.flush();
			}
			
			
			
			if(os!=null)os.close();
			if(is!=null)is.close();
			if(sock!=null)sock.close();
			if(serve!=null)serve.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
