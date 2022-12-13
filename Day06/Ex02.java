class Car{
	
	public String model;
	public Srting color;
	public int speed;
	
	//기능 - > 메서드 로 표현
	//속성 -> 필드 로 표현
	//유념해야할 사항? 모닝 타고 
	public void speedUp(){speed+=10;}
	public void speedDown(){speed-=10;}	
}


class Ex02 {

public static void main(String[] args){
	Car myCar = new Car();
	myCar.model="모닝";
	myCar.color="빨강";
	System.out.println(myCar.color + "색 내차 "+ myCar.model + " 
		의 현재 속도는 "+myCar.speed+"km");

	for(int i =0; i < 9; i++){
		myCar.speedUp();
		System.out.println(myCar.color + "색 내차 "+ myCar.model + "
		 의 현재 속도는 "+myCar.speed+"km");
	}
	

}

}