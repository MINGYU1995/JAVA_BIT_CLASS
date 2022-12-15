package com.bit;
import java.util.*;

public class Ex07 {
/*
 * 	System.out.println("주민번호체크(ver 0.1.1");
		System.out.println("991231-234567");
		System.out.println("당신은 00살 여성입니다.");
		
		System.out.println("주민번호> 9912312345678");
		System.out.println("입력확인 바랍니다.");
		
		System.out.println("주민번호> 991231-234567");
		System.out.println("입력확인 바랍니다(앞자리6개 뒷자리7개입니다.)");
*/
	
	public static void main(String[] args) {
		System.out.println("주민번호체크(ver 0.1.1");
		System.out.println("주민번호>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean boo = true;
		String gender = "";
		
	
		//	System.out.println("".length()==0) //입력값비교
		//System.out.println(st1.indexOf('d')); //해당 인덱스값 출력  '-' 확인 조건
		
	//	do{		
			if(input.length() > 12 && input.charAt(6)=='-'){
				
				if(input.charAt(7)=='1' && input.charAt(7)=='3'){
					gender = "남자";
					System.out.println("성공"+ gender);
				}else if(input.charAt(7)=='2' && input.charAt(7)=='4') {
					gender = "여자";
					System.out.println("성공"+ gender);
				}					
				
			}else 
			{
			if(input.charAt(6)!='-') {
				System.out.println("입력확인 바랍니다.(000000-000000)");
			}else if(input.length() > 13){
				System.out.println("입력확인 바랍니다(앞자리6개 뒷자리7개입니다.)");
				}
				
			}				
		//}while(boo);
	}

private static boolean isInteger(String input) {
	// TODO Auto-generated method stub
	return false;
}

}
