package com.bit;

public class Ex07 {
	
	
	void func() {
		System.out.println("Funck");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object obj = new Object();
		Class cls1 = obj.getClass();
		Class cls2 = Object.class;
		Ex07 me = new Ex07();//객체찍는방법1
		Class cls3 = me.getClass();
		Class cls4 = Ex07.class;
		
		//객체찍는방법2
		Class cls5 = Class.forName("com.bit.Ex07");
		Ex07 obj2 = (Ex07)cls5.newInstance();
		System.out.println(obj2); //객체가 생성되어있다. 
		obj2.func();
		
	}
}
