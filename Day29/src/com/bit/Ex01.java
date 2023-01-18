package com.bit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {

   public static void main(String[] args) {
      ServerSocket serv = null;
      Socket sock = null;
      System.out.println("preparing");
      OutputStream os = null;
      InputStream is = null;
      InputStreamReader isr = null;
      BufferedReader br = null;
      File f = new File("D:\\java\\JAVA_BIT_CLASS\\Day29\\src\\com\\bit\\abc.jpg");

      try {
         serv = new ServerSocket(8080);
         sock = serv.accept(); // favicon
         System.out.println("first");
         sock = serv.accept(); // data
         System.out.println("second");
         
//         SocketAddress addr = sock.getRemoteSocketAddress();
//         InetSocketAddress addr2 = (InetSocketAddress) addr;
//         System.out.println("connected");
//         System.out.println(addr2.getHostString());
         is = sock.getInputStream();
         isr = new InputStreamReader(is);
         br = new BufferedReader(isr);
         String msg = null;
         msg = br.readLine();
         String[] msgs = msg.split(" ");
         f = new File(msgs[1].substring(1));
//         while((msg=br.readLine())!=null) {
//        	 System.out.println(msg);
//         }
         is.close();
         os = sock.getOutputStream();
//       os.write("abcdefg".getBytes()); // 연결안됨 -> 형식에 맞지 않다.
         os.write("HTTP/1.1 200 OK\r\n".getBytes());
//       os.write("Content-Type: text/html; charset=utf-8 \r\n".getBytes());
         os.write("\r\n".getBytes());
         os.write("<h1>abcd</h1>".getBytes());
         
         os.write("Content-Type: img/jpeg \r\n".getBytes());
         InputStream is = new FileInputStream(f);
         int su = -1;
         while((su=is.read())!=-1) {
            os.write(su);
         }
         is.close();
         
         sock.close();
         serv.close();
         
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}