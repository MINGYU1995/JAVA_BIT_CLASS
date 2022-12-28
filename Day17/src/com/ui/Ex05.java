package com.ui;

import java.awt.Button;
import java.awt.Frame;
//배치관리자의 역할 안했을경우/?
public class Ex05 extends Frame{

	public Ex05() {
		setLayout(null);
		
		Button btn1 = new Button();
		btn1.setLabel("btn1");
		btn1.setSize(100,100);
		btn1.setLocation(50,50);
		add(btn1);
		
		setLocation(200,200);
		setSize(400,200);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();

	}

}
