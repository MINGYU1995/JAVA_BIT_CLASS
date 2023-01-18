package com.step04;

import java.net.*;
import java.util.ArrayList;
import java.awt.List;
import java.io.*;

public class Server {
//쓰레드 두갤
	public static void main(String[] args) {
		java.util.List<PrintWriter> list=new ArrayList<>();
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(8080);
			while(true) {
				final Socket sock=serv.accept();
				System.out.println(sock.getOutputStream().hashCode()+" 입장");
				
				Thread thr=new Thread(new Runnable() {
					
					@Override
					public void run() {
						InputStream is=null;
						OutputStream os=null;
						InputStreamReader isr=null;
						OutputStreamWriter osw=null;
						BufferedReader br=null;
						PrintWriter pw=null;
						InetAddress addr=null;
						
						try {
							addr=sock.getInetAddress();
							is=sock.getInputStream();
							os=sock.getOutputStream();
							isr=new InputStreamReader(is);
							osw=new OutputStreamWriter(os);
							br=new BufferedReader(isr);
							pw=new PrintWriter(osw);
							
							list.add(pw);
							
							String msg=null;
							while((msg=br.readLine())!=null) {
								msg+=addr.getHostAddress();
								for(int i=0; i<list.size(); i++) {
									PrintWriter w=list.get(i);
									w.println(msg);				//모두에게 보여주기위해 자료구조에 담아주면되고 몇명이 들어올지 모르니 동적할당
									w.flush();
								}
								System.out.println(msg);
							}
							
							if(isr!=null)isr.close();
							if(osw!=null)osw.close();
							if(br!=null)br.close();
							if(pw!=null)pw.close();
							if(os!=null)os.close();
							if(is!=null)is.close();
							
						} catch (IOException e) {
							e.printStackTrace();
						}
						
						
					}
				});
				thr.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
