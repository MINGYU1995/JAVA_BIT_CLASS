package com.bit;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex21 {

	public static void main(String[] args) {
		Date d = new Date(2022-1900,12-1,26);
		long before = d.getTime();
		before+=1000L*60L*24L*100L;
		Date d2 = new Date(before);
		System.out.println(d);
		System.out.println(d2);
		Calendar cal = new GregorianCalendar(2022,12-1,26);
		cal.add(Calendar.DATE,100);
	}

}
