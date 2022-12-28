package com.ui;
import java.awt.*;

import javax.swing.*;

public class Ex06 extends Frame{

	public Ex06() {
		setLayout(new BorderLayout());
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		JButton btn1= new JButton();
		btn1.setLabel("한글2");
		p.add(btn1);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2,1));
		JButton btn2= new JButton();
		btn2.setLabel("한글2");
		p2.add(btn2);
		add(btn2,BorderLayout.WEST);
		add(p,BorderLayout.CENTER);
		setLocation(100,100);
		setSize(400,300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new Ex06();

	}

}
