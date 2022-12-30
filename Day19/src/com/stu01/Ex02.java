package com.stu01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

   public static void main(String[] args) {
      System.out.println("학생성적관리프로그램(ver 0.5.1)");
      Scanner sc = new Scanner(System.in);
      File f = new File("./src/com/stu02/data.bin");
      int input = -1;
      while(true) {
         System.out.print("1.리스트 2.보기 3.입력 4.수정 5.삭제 0.종료>");
         input = sc.nextInt();
         if(input==0) break;
         if(input==1) {
            
            System.out.println("===================================================");
            System.out.println("학번\t국어\t영어\t수학");
            System.out.println("===================================================");
            if(f.exists()) {
               InputStream is = null;
               try {
                  is = new FileInputStream(f);
                  while((input = is.read())!=-1) {
                     System.out.print((char)input);
                  }
                  
                  if(is!=null) is.close();
               } catch (FileNotFoundException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
            System.out.println("===================================================");
         }
         if(input==2) {
            System.out.print("학번 >");
            input = sc.nextInt();
            InputStream is = null;
            BufferedInputStream bis = null;
            try {
               is = new FileInputStream(f);
               bis = new BufferedInputStream(is);
               ArrayList<Byte> arr = new ArrayList<Byte>();
               while(true) {
                  int su = bis.read();
                  if(su==-1) break;
                  if (su=='\r'||su=='\n') {
                     Object[] arr2 = arr.toArray();
                     byte[] arr3 = new byte[arr2.length];
                     for (int i = 0; i < arr3.length; i++) {
                        arr3[i]=(byte)arr2[i];
//                     Byte[] arr3 = arr.toArray(new Byte[]);
                     }
                     String msg = new String(arr3);
                     if(msg.startsWith(input+"\t")) {
                        System.out.println(msg);
                     }
                     arr.clear();
                  } else {
                     arr.add((byte)su);                     
                  }
                     
               }
               
               if(bis!=null)bis.close();
               if(is!=null)is.close();
            } catch (FileNotFoundException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
            
         }
         if(input==3) { //입력
            System.out.print("학번>");
            int num =sc.nextInt();
            System.out.print("국어>");
            int kor =sc.nextInt();
            System.out.print("영어>");
            int eng =sc.nextInt();
            System.out.print("수학>");
            int math =sc.nextInt();
            
            OutputStream os = null;
            PrintStream ps = null;
            try {
               if(!f.exists())f.createNewFile();
               os = new FileOutputStream(f,true);
               ps = new PrintStream(os);
               ps.println(num+"\t"+kor+"\t"+eng+"\t"+math);
               
               
               if(ps!=null)ps.close();
               if(os!=null)os.close();
            } catch (FileNotFoundException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         if(input==4) {
            
         }
         if(input==5) {
            
         }
      }
   }
}