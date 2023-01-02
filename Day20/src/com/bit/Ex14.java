package com.bit;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;

public class Ex14 extends Frame{

	public Ex14() {
		LayoutManager lm2 = new BorderLayout();
		setLayout(lm2);
		LayoutManager lm = new BorderLayout();
		setLayout(lm);
		Panel p = new Panel();
		Panel p2 = new Panel();
		Button btn1 = new Button("start");
		Button btn2 = new Button("end");
		
		int count = 60, score = 0;
		Label la  = new Label(count+"second");
		Label la2  = new Label("socre:"+score + "point");
//		TextField tf = new TextField("60초");
//		TextField tf2 = new TextField("점수: 0점");
		
		p.setLayout(new GridBagLayout());
	
		
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		String[][]msg= {
				{"","","",""}
				,{"","","",""}
				,{"","","",""}
				,{"","","",""}
		};
		
		
		for (int i = 0; i < 4; i++) {
			String[] cols = msg[i];
			for (int j = 0; j < cols.length; j++) {
				gbc.gridx = j;
				gbc.gridy = i;
				p.add(new Button(cols[j]),gbc);						
			}
		}
		
		
		//btn1.setBounds(100,100,100,100);
		la.setAlignment(Label.CENTER);
		la2.setAlignment(Label.CENTER);
		
		add(la,BorderLayout.NORTH);
		add(la2,BorderLayout.SOUTH);

		add(btn1,BorderLayout.EAST);
		
		p2.add(btn2,BorderLayout.LINE_END);
		
		add(p,BorderLayout.CENTER);
		//add(p2,BorderLayout.EAST);
		setLocation(100,100);
		setSize(400,500);
		setVisible(true);
		
		
	}
		
		public static void main(String[] args) {
			new Ex14();

	}

}
