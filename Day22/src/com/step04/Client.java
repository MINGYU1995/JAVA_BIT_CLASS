package com.step04;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.Scanner;
//서버는 처리하는 쪽 
//클라이언트는 ui가 보여야함.

public class Client extends Frame implements ActionListener{
	
	static TextArea ta=new TextArea();
	TextField tf=new TextField();
	static PrintWriter pw;
	
	public Client() {
		tf.addActionListener(this);	//이벤트 붙이기
		setLayout(new BorderLayout());
		
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		setBounds(100,100,500,500);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		pw.println(msg);
		pw.flush();
		tf.setText("");
		tf.setText("");	
	}

	public static void main(String[] args) {
		Client client=new Client();
		String url="192.168.240.113";	//ip주소를 다른사람주소로 바꾸면 다른사람 서버에도 들어갈수있음
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;	//문자열로 바꿈
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		
		//Scanner sc=new Scanner(System.in);
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
//				System.out.print(">");
				msg=br.readLine();
				if(msg.equals("exit"))break;		//클라이언트가 종료하면
				
//				pw.flush();		//버퍼가 꽉차지않아도 flush()로 밀어내야함
				
				ta.append(msg+"\n");		//읽어온 메세지를 textarea에 뿌려주는 역할
			}
			
			if(os!=null)os.close();
			if(is!=null)is.close();
			if(sock!=null)sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
