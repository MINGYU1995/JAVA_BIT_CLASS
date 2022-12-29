package IO;
import java.io.*;
import java.util.Arrays;
//ByteArraylnputStream/ByteArrayOutputStream은 메모리, 즉 바이트배열에 데이터
//를 입출력 하는데 사용되는 스트림이다.
public class ByteBasedStream {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
	
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read())!=-1) {
			output.write(data);
		}
		outSrc = output.toByteArray();// 스트림의 내용을 byte배열로 반환
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));

	}

}
