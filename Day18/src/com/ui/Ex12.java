package com.ui;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex12 extends Frame implements ItemListener{
	public Ex12() {
		Panel p = new Panel();
		Choice tf = new Choice();
		tf.addItem("Item1");
		tf.addItem("Item2");
		tf.addItem("Item3");
		tf.addItem("Item4");
		tf.addItem("Item5");
		tf.addItemListener(this);
		p.add(tf);
		add(p);
		setBounds(500,100,300,300);
		setVisible(true);		
	}

	public static void main(String[] args) {
		Ex12 me = new Ex12();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice cho = (Choice) e.getSource();
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
	}

}
