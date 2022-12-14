class Ex01{

public static void main(String[] args){
System.out.println("-------------1번------------");

for(int i = 0; i < 4; i++){
	for(int j = 0; j <= i; j++){
	System.out.print("* ");
	}
	System.out.println(" ");
}
 
System.out.println("-------------2번------------");

for(int i =1; i < 5; i++){
	for(int j = 1;  j <= i; j++){
	System.out.print(j+" ");
}
	System.out.println(" ");
}

System.out.println("-------------3번------------");
int cnt = 0;
for(int i =1; i < 6; i++){
	for(int j = 1; j < i; j++){
	cnt++;
	System.out.print(cnt+" ");		
}
	System.out.println(" ");
}
System.out.println("-------------4번------------");

for(int i =1; i < 6; i++){
	for(int j = 5; j > i ; j--){
	System.out.print("* ");
}
System.out.println(" ");

} 	

System.out.println("-------------5번------------");

for(int i=1;i<5;i++){
	for(int j=4;j>0;j--){
		if(i<j){
			System.out.print(" ");
		}else{
			System.out.print("\u2605");
		}
	}
	System.out.println();
}


}
}