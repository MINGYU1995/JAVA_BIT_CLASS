package com.bit;
import java.util.Calendar;
public class Ex08 {
	public static void main(String[] args) {
		//
		long time = System.currentTimeMillis();
		java.util.Calendar cal;
		cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print(1+cal.get(Calendar.MONTH)+"월");
		System.out.print(cal.get(Calendar.DATE)+"일");
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("월요일");break;
		
		case 2:
			System.out.println("화요일");break;
		
		case 3:
			System.out.println("수요일");break;
		
		case 4:
			System.out.println("목요일");break;
				
		case 5:
			System.out.println("금요일");break;
				
		case 6:
			System.out.println("토요일");break;
				
		case 7:
			System.out.println("일요일");break;
				}
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("일요일");break;
			
			
		}
		System.out.print(cal.get(Calendar.HOUR)+"시");
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.print(cal.get(Calendar.SECOND)+"초");	
		
		
}
}

	




