class Ex12{


public static void main(String[] args){
	int alpNum = 65;
	char alp;

	String msg ="";
	String msg2 = "";
	String msg3 = "";

	String mun = "";
	String mun2 = "";

	for(int i = alpNum; i<=123; i++){ //97~122	
		if(i > 64 && i < 91){
			msg += (char)i;
		}else if(i > 96 && i < 122){
			msg2 +=(char)i;
		}
	}
		System.out.println(msg);
		System.out.println(msg2);
	
	System.out.println("------------------------------");
 	
	for(int i = 1 ; i < 10; i++){
		int j = 3;
		mun += i +" ";
		mun2 += "\u25A0" + " ";
		//msg3 += i;
		
		
		if(i%3==0){
			mun += "\n";
			mun2 += "\n";
			//msg3 += "\n";
		}

	}
	System.out.println(mun);
	System.out.println(mun2);
	System.out.println(msg3);
	}
}