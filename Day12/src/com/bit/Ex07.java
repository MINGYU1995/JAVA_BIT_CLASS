package com.bit;
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("주민번호체크 (ver 0.2.0)");
		Scanner sc = new Scanner(System.in);
		String number ="";
		boolean boo = true;
		String gender;
		//int num1 = Integer.parseInt(str);

		try {
			while(boo) {
				System.out.print("주민번호>");
				number = sc.nextLine();
				if(number.length() > 13) { //입력자체 오류코드
					System.out.println("입력확인바랍니다(앞자리6개 뒷자리7개입니다)");	
				}
				else if(number.charAt(6) != '-') {
					System.out.println("입력확인바랍니다(000000-0000000)");		
				}else {
					for (int i = 0; i < number.length(); i++) {
						if(((number.charAt(i)-'0') < 0 || (number.charAt(i)-'0'> 9)) && i!=6) {				
							System.out.println("입력확인바랍니다(숫자를 입력바랍니다)");		
						}
					}		
				}
				if(number.charAt(7)%2==0) gender = "남자";
				else gender = "여자";
				
				
				boo = false;
				System.out.println(number + "이고" + gender + "입니다.");
			}	
		}catch(java.util.InputMismatchException e) {
			System.out.println("문자를 입력하셨습니다.");
		}catch(java.lang.StringIndexOutOfBoundsException a) {
			System.out.println("인덱스 초과입니다.");
		}
	}

}
