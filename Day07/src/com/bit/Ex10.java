package com.bit;

//주민번호체크(ver 0.1.0)
//주민번호>991231-234568
//당신은 00살 여성입니다.
//-입력검사 

public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println("주민번호체크(ver 0.1.0");		
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		System.out.println("주민번호:");
		String temp = "";
		int tem1 = 0;
		int year,age;
		char tem2;
		String tem3;
		
		String msg1 = sc.nextLine();
		char[] arr1 = msg1.toCharArray();
		
		if(arr1[7] == '1' || arr1[7]=='2') {
			year = 1900+((arr1[0]-48)*10+(arr1[1]-48));
		}else{
            year = 2000+((arr1[0]-48)*10+(arr1[1]-48));
        }
	      age = 2020-year+1;    
	      
	     if(arr1[7] == '1' || arr1[7]=='3' ) tem3 = "남성";
	     else tem3 = "여성";
	     
				if(arr1[6] != '-') {
					System.out.print("입력확인바랍니다.");
					System.out.println("(000000-000000)");
				}else if(arr1[7] == '-' ) {
					System.out.println("입력확인바랍니다.(앞자리7개 뒷자리 6개입니다).");
				}else if(arr1[6] == '-' && arr1.length > 14) 
					System.out.println("입력확인바랍니다.(앞자리6개 뒷자리 7개입니다).");	
				else 
				{
					System.out.println("이상무");
					System.out.println("당신은"+age+"살"+ tem3 +"입니다.");	
				}
						
				int cnt = 0;
				for(int i=0; i<arr1.length; i++) {
					if(Character.isDigit(arr1[i]) == false) {
						cnt++;
						//System.out.println("입력확인바랍니다.(숫자를 입력해주세요.)");
					}
				}
				if(cnt > 0) {
					System.out.println("입력확인바랍니다.(숫자를 입력해주세요.)");
				}
				
			}
	

}
