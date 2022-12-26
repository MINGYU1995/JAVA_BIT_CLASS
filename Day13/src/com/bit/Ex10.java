package com.bit;
import java.util.Vector;
public class Ex10 {

	public static void main(String[] args) {
		java.util.Vector vec;
		vec = new Vector();
		vec.addElement(1111);
		vec.addElement(2222);
		vec.addElement(3333);
		vec.addElement(4444);
		vec.addElement(5555);
		
		java.util.Enumeration enu;
		enu = vec.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
//		System.out.println(enu.nextElement());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.nextElement());
		
		
		
//		
//		System.out.println("----------------");
//		System.out.println(vec.elementAt(0));
//		System.out.println(vec.elementAt(1));
//		System.out.println(vec.elementAt(2));
//		System.out.println(vec.elementAt(3));
//		System.out.println(vec.elementAt(4));
		
	}

}
