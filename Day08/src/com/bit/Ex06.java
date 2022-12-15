package com.bit;

public class Ex06 {

	public static void main(String[] args) {
		//**중요
		String target = "java DB  web framwork";
		System.out.println("->"+target.trim()+"<-"); //.trim()문자열(밖같)공백제거 
	
		String[] arr1 = target.split(",");//
		String st1 = "java";//문자만 다르면 다른 문자의 아스키값의 차이만큼만 반환.
		String st2 = "jav"; //길이가 다르면 배열의 길이만큼 값 반환
		System.out.println(st1.compareTo(st2)); //같을 때 0 return

	}

}
