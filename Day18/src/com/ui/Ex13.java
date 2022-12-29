package com.ui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ex13 extends Frame
			implements FocusListener{

	public Ex13() {
		Panel p = new Panel();
		TextField[] arr = new TextField[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new TextField(10);
			arr[i].addFocusListener(this);
			p.add(arr[i]);
		}
		arr[2].setFocusable(true);
		add(p);

		setBounds(500,100,300,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex13 me = new Ex13();

	}


	@Override
	public void focusGained(FocusEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println("포커스 얻고");
	}


	@Override
	public void focusLost(FocusEvent e) {
		TextField tf =(TextField) e.getSource();
		System.out.println(tf.getText()+"로커스를 잃고");
		if(tf.getSelectedText().length() == 4){
			tf.nextFocus();
		}	
	}

}
