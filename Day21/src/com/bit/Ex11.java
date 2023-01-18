package com.bit;

import java.io.*;

class Lec11 implements Serializable{
   private static final long serialVersionUID=2L;
   int su1=1111;
   transient int su2=2222;   //transient   - 값을 전달 못하게함
   private int su3=3333;   //private 라고해서 값이 전달안되는건 아님
   public void func() {
      System.out.println("func run -"+su1);
      System.out.println("func run -"+su3);   //private 라고해서 값이 전달안되는건 아님
   }
}

public class Ex11 {

   public static void main(String[] args) {
      OutputStream os=null;
      ObjectOutputStream oos=null;
      try {
         os=new FileOutputStream("data11.bin");
         oos=new ObjectOutputStream(os);
         
         Lec11 lec=new Lec11();
         oos.writeObject(lec);
         
         
         oos.close();
         os.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}