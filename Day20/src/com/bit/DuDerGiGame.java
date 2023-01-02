package com.bit;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DuDerGiGame extends Frame implements ActionListener{
	private JButton jbt[] = new JButton[12];
	private JButton start = new JButton();
	private JButton end = new JButton();
	private JLabel jlb = new JLabel("점수: 0");
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp21 = new JPanel();
	private GridLayout gl1 = new GridLayout(3,4);
	private GridLayout gl2 = new GridLayout(1,2);
	private FlowLayout fl21 = new FlowLayout(FlowLayout.RIGHT);
	private BorderLayout bl = new BorderLayout(10,10);
	private JLabel time_jlb = new JLabel("시간 => 0:30");
	public DuDerGiGame() {
		this.init();
		setBounds(100,100,700,700);
		setVisible(true);
	}
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(bl);
		con.add("North",time_jlb);
		con.add("Center",jp1);
		jp1.setLayout(gl1);
		for (int i = 0; i < 12; i++) {
			jbt[i] = new JButton();
			jp1.add(jbt[i]);
		}

		con.add("South",jp2);
		jp1.setLayout(gl2);
		jp2.add(jlb);
		jp2.add(jp21);
		jp21.setLayout(fl21);
		jp21.add(start);
		jp21.add(end);
		
		
	}

	
	
	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new DuDerGiGame();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
