package com.bit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Set;
import java.awt.*;

public class Ex01 extends Frame implements ActionListener , TextListener{

	

	@Override
	public void textValueChanged(TextEvent e) {
	//	change = true;
	}
	public Ex01() {
		setTitle("제목없음.");
		TextArea ta = new TextArea();
		MenuBar mb = new MenuBar();
		Menu mn1 = new Menu("파일File"); 	 
		MenuItem mi1 = new MenuItem("new");
		MenuItem mi2 = new MenuItem("Open");
		MenuItem mi3 = new MenuItem("Save");
		MenuItem mi4 = new MenuItem("Exit");
		MenuItem mi5 = new MenuItem("About");
		mn1.add(mi1);
		mn1.addSeparator();
		mn1.add(mi2);
		mn1.add(mi3);
		mn1.add(mi4);
		mb.add(mn1);
		
		Menu mn2 = new Menu("Help");
		mn2.add(mi5);
		mb.add(mn2);
		setMenuBar(mb);
		add(ta);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		setBounds(100,100,500,300);
		setVisible(true);
	}
	private void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem mi = (MenuItem)e.getSource();
		if(mi.getLabel().equals("Exit")) {
			dispose();
		}
		if(mi.getLabel().equals("About")) {
			Dialog dia = new Dialog(this,"About");
			WindowAdapter win = new WindowAdapter() {
				
			
			dia.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dia.dispose();
				}
			});
			dia.addWindowListener(win);
			dia.setLayout(new GridLayout(3,1));
			Panel p1 = new Panel();
			Panel p2 = new Panel();
			Panel p3 = new Panel();
			p1.add(new Label("welcome"));
			p2.add(new Label("2023-01-02"));
			Button btn = new Button("Close");
			btn.addActionListener(new ActionListener() {			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
					
				}
			});
			
			
			dia.add(btn);			
			dia.setBounds(200,200,300,150);
			dia.setVisible(true);
		}
		
	}

}
