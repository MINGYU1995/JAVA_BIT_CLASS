package com.ui;

import java.awt.*;

public class Ex03 extends Frame{
	                                                            
	static CardLayout cl;
	public Ex03() {
		LayoutManager lm;
//		lm = new GridLayout(5,4);
//		setLayout(lm);
//		Layout fl = new Layout();
//		setLayout(fl);
		cl = new CardLayout();
		//lm = new BorderLayout();
		setLayout(cl);
		
		Button btn1 = new Button();
		btn1.setLabel("btn1");
		add(btn1);
		
		Button btn2 = new Button();
		btn2.setLabel("btn2");
		add(btn2);
		
		Button btn3 = new Button();
		btn3.setLabel("btn3");
		add(btn3);
		
		Button btn4 = new Button();
		btn4.setLabel("btn4");
		add(btn4);
		
		Button btn5 = new Button();
		btn5.setLabel("btn5");
		add(btn5);
		
		Button btn6 = new Button();
		btn6.setLabel("btn6");
		add(btn6);
		
		
		setSize(400,400);
		setLocation(200,200);
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Ex03 me = new Ex03();
		me.setVisible(true);
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);			
			cl.next(me);
		}

	}

}
