package com.bit;

import java.io.*;

public class Ex12 {

   public static void main(String[] args) {
      InputStream is=null;
      ObjectInputStream ois=null;
      try {
         is=new FileInputStream("data11.bin");
         ois=new ObjectInputStream(is);
         
         Lec11 obj=(Lec11)ois.readObject();
         
         System.out.println(obj.su1);
         System.out.println(obj.su2);
//         System.out.println(obj.su3);
         obj.func();
         ois.close();
         is.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }

   }

}