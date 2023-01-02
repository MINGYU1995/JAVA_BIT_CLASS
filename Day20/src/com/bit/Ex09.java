package com.bit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09 {

	public static void main(String[] args) {
		try(
				//이괄호안에서 선언되어져야함.
			Reader fr = new FileReader("test07.txt");
			BufferedReader br = new BufferedReader(fr);
				//자동으로 오토클로징해버림?
				
		){
			String msg = null;
			while((msg = br.readLine())!=null)
				System.out.println(msg);
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
