package com.bit;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		// url vs uri
		// 프로토콜://도메인/포트번호/경로/../경로?쿼리스트링#reference		//앵커(reference)
		// 프로토콜 - http / https
		// 도메인 - 도메인 주소 or ip주소 입력 가능
		// 포트 - 원칙적으로는 :뒤에 명시, 포트는 생략가능(생략시 디폴트포트번호)
		// 쿼리스트링 - 사용자측에서 서버에게 요청하는 정보
		// 레퍼런스 - 
		String msg="http://www.naver.com/";
//		msg="http://www.tzr.io/";
		java.net.URL url=null;
		try {
			url=new URL(msg);
			System.out.println("protocol :"+url.getProtocol());
			System.out.println("domain : "+url.getHost());
			System.out.println("port : "+url.getPort());	//port번호는 생략가능
			System.out.println("default port : "+url.getDefaultPort());
			System.out.println("path : "+url.getPath());
			System.out.println("queryString : "+url.getQuery());
			System.out.println("reference : "+url.getRef());
			System.out.println("file : "+url.getFile());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
