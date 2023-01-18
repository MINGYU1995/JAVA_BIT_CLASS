package com.bit;
//자바 크롤링?
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {

	public static void main(String[] args) {
		File f=new File("7zip.exe");
		URL url=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream os=null;
		try {
			os=new FileOutputStream(f);
			url=new URL("https://www.7-zip.org/a/7z2201-x64.exe");	//web에서 다운로드를 받을수 있음
			URLConnection conn=url.openConnection();
			is=conn.getInputStream();
//			isr=new InputStreamReader(is);
//			br=new BufferedReader(isr);
			
			int msg=-1;
			while((msg=is.read())!=-1) {
				os.write(msg);
			}
			
			System.out.println("크롤링...완료");
//			if(pw!=null)pw.close();
//			if(fw!=null)fw.close();
//			if(br!=null)br.close();
//			if(isr!=null)is.close();
			if(is!=null)is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
