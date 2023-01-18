package com.bit;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			InetAddress[] inets=InetAddress.getAllByName("");	//www.를 붙이면 전세계 공통, 해외에서 사용하려면 www.사용해야함
			
			for (int i = 0; i < inets.length; i++) {
				System.out.println(inets[i].getHostAddress());		
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
