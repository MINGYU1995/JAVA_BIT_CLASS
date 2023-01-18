package com.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Vector;

import org.omg.CORBA.portable.InputStream;

public class Ex10 {

	public static void main(String[] args) {
		FileInputStream is = null;
		ObjectInputStream ois = null;
		try {
			
			is = new FileInputStream("data09.bin");
			ois = new ObjectInputStream(is);
			int su1 = ois.readInt();
			double su2 = ois.readDouble();
			boolean boo = ois.readBoolean();
			String msg = ois.readUTF();
			
			int[] arr1 = (int[]) ois.readObject();
			Vector arr2 = (Vector) ois.readObject();
			
					
			
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(boo);
			System.out.println(msg);
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2.toArray()));
			
			if(ois!=null)ois.close();
			if(is!=null)is.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
