class Ex07{
public static void main(String[] args){

	// 3가지 경우의수 ? 3이라는 정수를 두변수의 담아서 서로 비교하여 큰쪽이 이기는 코드를 작성한다.
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int comSu = 0,meSu = 0;
	int comScore = 0, meScore = 0;
	comSu = Math.random(3);
	int comP=0,meP=0;

	System.out.println("1.가위 2.바위 3.보 0.종료");
	
	/*

	switch(meSu){
	case 0:break;
	case 1:System.out.println("me:가위");break;
	case 2:System.out.println("me:바위");break;
	case 3:System.out.println("me:보");break;
	}
	*/
	
	int sc = sc.nextInt();
	meSu = sc;

	if(meSu == 1)	//각 가위,바위,보에 따라 상수 부여
	{
	meP=1;
	System.out.println("me:가위");
	}
	else if(meSu == 2)
	{
	meP=2;
	System.out.println("me:바위");
	}
	else if(meSu ==3){
	meP=3;
	System.out.println("me:보");	
	}else System.out.println("종료");	

	if(comSu == 1 )
	{
	comP=1;
	System.out.println("com:가위");
	}else if(meSu == 2){
	comP=2;
	System.out.println("com:바위");
	}else{
	comP=3;
	System.out.println("com:보");
	}
	/*
	if(meSu == comSu){
	System.out.println("비겼습니다.");
	}else if(meSu == 1 && comSu == 2){
	System.out.println("졌습니다.");
	}else if(meSu == 1 && comSu == 3){
	System.out.println("이겼습니다.");
	}else if(meSu == 1 && comSu == 1){
	System.out.println("비겼습니다.");
	}
	}else if(meSu == 2 && comSu == 3){
	System.out.println("졌습니다.");
	}else if(meSu == 3 && comSu == 1){
	System.out.println("졌습니다.");
	}else if(meSu == 3 && comSu ==2){
	System.out.println("이겼습니다.");
	}else if(meSu == 3 && comSu ==3){
	System.out.println("비겼습니다.");
	}

	if(comSu > meSu) {                 
	comScore++;
	System.out.println("졌습니다.");
	}else if(meSu > comSu){
	meScore++;
	System.out.println("이겼습니다.");
	}else {
	meScore++;
	comScore++;
	System.out.println("비겼습니다.");
	}

	*/
	

	System.out.println("수고하셨습니다");

	//System.out.println(ran);
	}
}