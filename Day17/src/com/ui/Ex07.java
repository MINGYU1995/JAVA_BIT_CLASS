package com.ui;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class Ex07 extends Frame {

	public Ex07() {
		Panel p = new Panel();
		Button btn1 = new Button("bbbbbb");
		btn1.setEnabled(false);
		btn1.enable(false);
		p.add(btn1);
	
		JButton btn2 = new JButton("한글");
		btn2.setText("");
		
		byte[] arr = new byte[1611];
		
		File f = new File("img01.jpg");
		InputStream is = null;
		try {
			is = new FileInputStream(f);
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (byte)is.read();
			}	
			if(is!=null)is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		Icon defaultIcon = new ImageIcon(arr);
		btn2.setIcon(defaultIcon);
		
		
		p.add(btn2);
		
		TextField tf = new TextField(10);
		tf.setText(";;;;;;;;;;;;;;;;");
		tf.setEchoChar('*');
		p.add(tf);
		
		TextArea ta = new TextArea("aaaa",5,10,TextArea.SCROLLBARS_BOTH);
		p.add(ta);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("item1",false,cbg);
		ch1.setLabel("item1");
		Checkbox ch2 = new Checkbox("item2",true,cbg);
		ch2.setLabel("item2");
		Checkbox ch3 = new Checkbox("item3",false,cbg);
		ch3.setLabel("item3");
		ch3.setState(true);
		
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		Choice cho = new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.select(1);		
		p.add(cho);
		
		List list = new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		p.add(list);
		
		
		add(p);
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex07();

	}

}
