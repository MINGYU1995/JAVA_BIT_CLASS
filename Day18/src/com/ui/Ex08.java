package com.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Ex08 extends Frame implements MouseListener{

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("누름");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("누름");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("[눌렸었는데]올라옴");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("컴포넌트 위로 올라옴");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("빠져나옴");
		
	}
	
	public Ex08() {
		Panel p = new Panel();
		Button btn = new Button("버튼");
		btn.addMouseListener(this);
		add(p);
		
		
		
		p.add(btn);
		setBounds(600,100,300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex08 me = new Ex08();

	}

}
