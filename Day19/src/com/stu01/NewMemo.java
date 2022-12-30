package com.stu01;

import javax.swing.*;



public class NewMemo extends JFrame {
	
	public JTextArea ta = new JTextArea();
	JFileChooser chooser = new JFileChooser();
	JMenuBar mb = new JMenuBar();
	
	//생성자
	public NewMemo() {
		this.setTitle("메모장");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		String[] smenu = {"파일","도움말"};
		JMenu[] mfile = new JMenu[10];
		for (int i = 0; i < smenu.length; i++) {
			mfile[i] = new JMenu(smenu[i]);
			mb.add(mfile[i]);
		}
		
		String[] Menual = {"정보"};
		this.setJMenuBar(mb);
		mfile[1].add(Menual[0]);
		
		String[] ScrItem = {"새로만들기","열기","저장","종료"};
		JMenuItem[] item = new JMenuItem[5];
		for (int i = 0; i < ScrItem.length; i++) {
			item[i] = new JMenuItem(ScrItem[i]);
			
			this.setJMenuBar(mb);
			mfile[0].add(item[i]);
		}
		this.add(ta);
		this.setVisible(true);
	}
		
	
	
	
	public static void main(String[] args) {
	new NewMemo();
	}

}
