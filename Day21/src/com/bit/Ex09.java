package com.bit;

import java.io.*;
import java.util.*;

public class Ex09 {
   public static void main(String[] args) {
      // Object Stream
      OutputStream os=null;
      ObjectOutputStream oos=null;
      try {
         os=new FileOutputStream("data01.bin");
         oos=new ObjectOutputStream(os);
         oos.writeInt(1234);
         oos.writeDouble(3.14);
         oos.writeBoolean(true);
         oos.writeUTF("문자열");
         int[] arr1= {1,3,5,7,9};
         oos.writeObject(arr1);
         
         Vector arr2=new Vector();
         arr2.add(1234);
         arr2.add(3.14);
         arr2.add(true);
         arr2.add('A');
         arr2.add("여기까지");
         oos.writeObject(arr2);
         
         ArrayList arr3 = new ArrayList();
         arr3.add(43212);
         arr3.add(4.14);
         arr3.add("arraylist");
         oos.writeObject(arr3);
         
         HashSet arr4 = new HashSet();
         arr4.addAll(arr3); // 깊은 복사
         arr4.add(arr3); // 
         oos.writeObject(arr4);
         
         if(oos!=null) oos.close();
         if(os!=null) os.close();
         System.out.println("작성..");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }

}