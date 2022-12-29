package com.ui;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Ex09 extends Frame implements MouseMotionListener{
   Label lb;
   public Ex09() {
	   						
      Panel p = new Panel();
      p.setLayout(null);
      p.addMouseMotionListener(this);
      lb = new Label("★");
      lb.setSize(35, 35);
      lb.setLocation(100, 100);
      p.add(lb);
      add(p);
      setBounds(600, 100, 400, 400);
      setVisible(true);
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Ex09 me = new Ex09();
      
   }
   @Override
   public void mouseDragged(MouseEvent e) {
      // TODO Auto-generated method stub
      int x = e.getX();
      int y = e.getY();
//      int x = e.getXOnScreen();
//      int y = e.getYOnScreen();
      System.out.println("드래그 x:"+x+" y:"+y);
      lb.setLocation(x, y);
   }
   @Override
   public void mouseMoved(MouseEvent e) {
      // TODO Auto-generated method stub
//      System.out.println("움직");
   }

}