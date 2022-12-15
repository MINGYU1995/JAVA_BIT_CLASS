package com.bit;

public class Ex08 {

	public static void main(String[] args) {
		int age = 2022-1900;
		char gender='여';
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		boolean boo2 = true;
		String msg = null;
		char[] hangul = {
			'영','일','이','삼','사','오','육','칠','팔','구',	
		};
		do {
		System.out.println("주민번호>");
		String input = sc.nextLine();
		
		for(int i=0; i<hangul.length; i++) {
			input = input.replace(hangul[i], (char)(i+'0'));
			//hangul에 있는 한글원소들을 char형 숫자로 변환하고 input
		}
		
		
		boolean boo = false;
		
		for(int i=0; i < input.length();i++) {
			if(i!=6) {
				if(input.charAt(i)<'0'|| input.charAt(i)>'9');
				boo = true;
			}		
		}
		
		if(input.charAt(6)!='-') {
			System.out.println("입력확인부탁드립니다.(00000-00000)");
		}else if(input.length()!=13) {
			msg = "입력확인부탁드립니다.(앞6개,7개입니다.)";
		}else if(boo) {
			msg = "입력확인부탁드립니다.(숫자를 입력해주세요.)";
		}else {
		
		age-=(input.charAt(0)-'0')*10+(input.charAt(1)-'0')*1;
		age++;
		
		if(input.charAt(7)>'2') { //2000년생 계산...
			age-=100;
		}		
		if(input.charAt(7)%2!=0) {
			gender = '남';			
		}	
		//위 else 마지막 문단.
	    msg = "당신은" + age + "세" + gender +"성입니다.";
		boo2=false;
		}
		System.out.println(msg);
		}while(boo2);
		
	}

}
