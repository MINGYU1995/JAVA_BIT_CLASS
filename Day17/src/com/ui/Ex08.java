package com.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;

public class Ex08 extends Frame {
		public Ex08() {
			//Panel p = new Panel();
			LayoutManager lm = new GridBagLayout();
			
			GridBagConstraints gbc = new GridBagConstraints();
			lm = new GridLayout(5,5);
			setLayout(lm);

			Panel p = new Panel();
			
			
			setLocation(300,300);
			setSize(500,500);
			gbc.fill = GridBagConstraints.BOTH;
			
			TextField tf = new TextField(10);
			
			add(tf,gbc);
			
			Button btn1 = new Button();
			//p.add(btn1);
			btn1.setLabel("1");
			gbc.gridx = 0;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn1,gbc);
			
			Button btn2 = new Button();
			btn2.setLabel("2");
			gbc.gridx = 2;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn2,gbc);
			
			Button btn3 = new Button();
			btn3.setLabel("3");
			gbc.gridx = 3;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn3,gbc);
			
			Button btn4 = new Button();
			btn4.setLabel("4");
			gbc.gridx = 1;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn4,gbc);
			
			Button btn5 = new Button();
			btn5.setLabel("5");
			gbc.gridx = 2;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn5,gbc);
			
			Button btn6 = new Button();
			btn6.setLabel("6");
			gbc.gridx = 3;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn6,gbc);
			
			Button btn7 = new Button();
			btn7.setLabel("7");
			gbc.gridx = 1;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn7,gbc);
			
			Button btn8 = new Button();
			btn8.setLabel("8");
			gbc.gridx = 2;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn8,gbc);
			
			Button btn9 = new Button();
			btn9.setLabel("9");
			gbc.gridx = 3;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn9,gbc);
			
			Button btn10 = new Button();
			btn10.setLabel("*");
			gbc.gridx = 4;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn10,gbc);
			
			Button btn11 = new Button();
			btn11.setLabel("/");
			gbc.gridx = 4;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn11,gbc);
			
			Button btn12 = new Button();
			btn12.setLabel("-");
			gbc.gridx = 4;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn12,gbc);
			
			Button btn13 = new Button();
			btn13.setLabel("=");
			gbc.gridx = 4;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn13,gbc);
			
			Button btn14 = new Button();
			btn14.setLabel(".");
			gbc.gridx = 3;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn14,gbc);
			
			Button btn15 = new Button();
			btn15.setLabel("0");
			gbc.gridx = 2;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn15,gbc);
			
			Button btn16 = new Button();
			btn16.setLabel("+");
			gbc.gridx = 1;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 1; //가중치가 같아야 변환을 줘도 같다	가중치조절어려움.
			gbc.weighty = 1;
			add(btn16,gbc);
			
			
			
		
			
		}
	
	
	
	public static void main(String[] args) {
		Ex08 me = new Ex08();
		me.setVisible(true);
	}

}
