class Ex01{

public static void main(String[] args){
	int speed = 0;
	System.out.println("내 차의 시속" + speed+ "km 입니다.");

	for(int i=0; i<10; i++){
	 speed+=10;
	 System.out.println("내 차의 시속" + speed+ "km 입니다.");
	}
	for(int i=0; i<0; i++){
	 speed-=10;
	 System.out.println("내 차의 시속" + speed+ "km 입니다.");
	} 
}
}