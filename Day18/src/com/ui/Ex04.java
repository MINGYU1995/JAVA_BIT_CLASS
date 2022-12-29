package com.ui;
import java.awt.*;

//inputstream
//datainputstream
//readwrite buffer 사용


public class Ex04 extends Frame{

	Canvas can = new Canvas();
	class MyCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			char[] arr = "한글".toCharArray();
			
		}
	}	
	
	
	public Ex04() {
		
		add(can);
		setBounds(100,100,500,500);
		setVisible(true);
		repaint();
		
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
