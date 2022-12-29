package IO;
import java.io.*;

public class OuputValue {

	public static void main(String[] args) {
	int sum = 0;
	int score = 0;
	
	FileInputStream fis = null;
	DataInputStream dis = null;
	
	try {
		fis = new FileInputStream("score.dat");
		dis = new DataInputStream(fis);
		
		while(true) {
			score = dis.readInt();
			System.out.println(score);
			sum += score;
		}	
	}catch (EOFException e) {
		System.out.println("점수의 총합은 " +sum + "입니다.");
	}catch(IOException ie) {
		ie.printStackTrace();
	}finally {
		try {
			if(dis!=null) {
				dis.close();
			}
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	} //try

	} //main

}
