package com.ui;

import java.awt.Panel;

public class Ex03 {

	
	public Ex03() {
		
		tf.setFont(f);
		p.add(tf);
		Button btn = new Button("버튼");
		Panel p = new Panel();
		p.add(btn);
		//btn.setvi
		add(p);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();

		

	}

}
