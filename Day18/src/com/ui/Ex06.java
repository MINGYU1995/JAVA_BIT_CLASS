package com.ui;
import java.awt.*;
public class Ex06{

	public static void main(String[] args) throws InterruptedException {
		Frame f = new Frame("이름없음");
		f.setBounds(100,100,500,500);
		f.setVisible(true);
		FileDialog dia2 = new FileDialog(f,"팝업창",FileDialog.SAVE);
		String filename = dia2.getFile();
		String parent = dia2.getDirectory();
		String name = dia2.getName();
		String title = dia2.getTitle();
		System.out.println("파일다이얼로그 호출...");
		System.out.println(filename);
		System.out.println(parent);
		
		
		Dialog dia = new Dialog(f);
		dia.setVisible(true);
		dia.setBounds(200,200,200,200);
		Thread.sleep(3000);
		f.dispose();
		

	}

}
