class Ex04_4{

public static void main(String[] args){
int su=1;
while(su<10){
	int dan=2;
	while(dan<10){
		System.out.print(dan+"x"+su+"=" + dan*su + "\t");
		dan++;
	}
	System.out.println();
	su++;
	}
}
}