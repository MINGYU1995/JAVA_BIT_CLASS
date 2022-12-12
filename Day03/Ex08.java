class Ex08
{
public static void main(String[] args)
{
	//문자열 
	char ch1='A';
	String st1="";
	System.out.println(ch1);
	System.out.println(st1);
	System.out.println("문자열2");

	System.out.println("------------------------------------------");
	String st2="문자";
	String st3="열";
	String st4=2000+22+"년"; //int연산 이후 스트링연산 연산기호 우선순위 중요*
	String st5="year"+(2000+22); // 문자열 이후 문자열로 계산
	System.out.println(st2+'열');
	System.out.println("문자"==st2); //true가 나옴.
	System.out.println("문자"+2==st2+2); //false가 나옴. ==는 레퍼런스기호임. 스트링 비교x
	int su=2;
	if("문자"+su=="문자2")
	{
		System.out.println("if ok");  
	}

	switch("문자"+su){
	case "문자2":
		System.out.println("switch ok");break;  //switch ok만 출력
	}
}
}