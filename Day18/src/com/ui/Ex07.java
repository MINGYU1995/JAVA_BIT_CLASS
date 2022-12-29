package com.ui;
//이벤트 처리
import java.awt.*;
import java.awt.event.*;

class UI07 extends Frame implements WindowListener{
   public UI07() {
      addWindowListener(this);
      setBounds(900,100,500,300);
      setVisible(true);
   }

   @Override
   public void windowOpened(WindowEvent e) {
      System.out.println("창 열림");
   }

   @Override
   public void windowClosing(WindowEvent e) {
      System.out.println("창 닫음");
      dispose();
//      System.exit(0);
   }

   @Override
   public void windowClosed(WindowEvent e) {
      // TODO Auto-generated method stub
      System.out.println("call disposed");
   }

   @Override
   public void windowIconified(WindowEvent e) {
      // TODO Auto-generated method stub
      System.out.println("최소화");
   }

   @Override
   public void windowDeiconified(WindowEvent e) {
      // TODO Auto-generated method stub
      System.out.println("반최소화");
   }

   @Override
   public void windowActivated(WindowEvent e) {
      // TODO Auto-generated method stub
      System.out.println("창 활성화");
   }

   @Override
   public void windowDeactivated(WindowEvent e) {
      // TODO Auto-generated method stub
      System.out.println("창 비활성화");
   }
}

public class Ex07 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new UI07();
   }

}