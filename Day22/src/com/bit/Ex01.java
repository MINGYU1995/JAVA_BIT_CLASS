package com.bit;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01 { //ip조회

	public static void main(String[] args) {
		java.net.InetAddress addr1=null;
//		byte[] arr1= {(byte)192,(byte)168,(byte)240,(byte)166};	//cmd 창에서 ipconfig명령어로  ip확인가능	//1바이트 4개
		byte[] arr1= {127,0,0,1};	//루프백(loopback 즉, 자기자신을 가리키는 ip
//		System.out.println(Arrays.toString(arr1));
		try {
//			addr1=InetAddress.getByName("DESKTOP-4NBJ8CO");		//내 컴퓨터 이름을 통해서 ip주소를 알아낼수있음
			addr1=InetAddress.getByName("localhost");	//자기 자신을 가리키는 이름 
			addr1=InetAddress.getByName("google.com");
//			addr1=InetAddress.getByAddress(arr1);
			
//			System.out.println(addr1.getHostName());
			//naver - 223.130.200.104
			//google - 142.250.76.142
			//ip(ipV4) - 1바이트 x 4
			
			System.out.println(addr1.getHostAddress());	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
