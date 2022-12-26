package com.bit;
import java.text.SimpleDateFormat;
import java.util.*;
public class Ex20 {
	
//	public static void main(String[] args) {
//	Date d = new Date();
//	SimpleDateFormat sdf;
//	sdf = new SimpleDateFormat();
//	sdf.applyPattern("yyyy-mm-dd");
//	String msg = sdf.format(d);
//	System.out.println(msg);
	
	public static void main(String[] args) {
		//100일 계산기
		// 년>
		// 월>
		// 일>
		// 0000-01-01에서 100일 뒤는 0000-00-00입니다.
		int inputYear , inputMon = 0 , inputDay;
		Calendar cal = Calendar.getInstance();
		System.out.println("100일 계산기");
		Scanner sc = new Scanner(System.in);
		System.out.print("년>");
		inputYear = sc.nextInt();
		System.out.print("월");
		inputMon = sc.nextInt();
		System.out.print("일");
		inputDay = sc.nextInt();
		cal.set(inputYear, inputMon-1,inputDay);
		cal.add(Calendar.DATE, 100); //100일 추가.
		System.out.println(inputYear+"년" +inputMon + "월"
				+ inputDay+ "일" + "에서 100일 뒤는"+
		cal.get(Calendar.YEAR)+ "년"
		+(1+cal.get(Calendar.MONTH))+"월"
		+cal.get(Calendar.DATE)+"일"
		);
		
		
		

	}

}
