class Car{
	public final String model;
	public int speed;
	public int maxSpeed;
	
	public 

	public Car(){	//생성시점 때 하고자하는 일을 명시하는 것 
			//필드속성에 대한 값을 주기위한 이유는 아니다.
		//model = "부가티";
		//maxSpeed = 400;
	 	//showSpeed();
		this("부가티",400);	// this 괄호는 생성자의 최상단에 써야함 
	}
	public Car(int b){
		maxSpeed = b;
		if(b<=120) model = "모닝";
		else if(b<=150) model = "아반떼";
		else if(b<=250) model = "그랜져";
		else if(b<=350) model = "제네시스";
		else model = "비싼차";
		showSpeed();
	}
	public Car(String a, int b){
		//객체 생성
		model=a;
		maxSpeed=b;
		ShowSpeed();
		
	}
	public void speedUp(){
		if(speed+10<=maxSpeed){
			speed+=10;
		}else{
			speed=maxSpeed;
		}
	}
	public void speedDown(){
		if(speed-17>=0){
			speed-=17;
		}else{
			speed=0;
		}
	}
	public void showSpeed(){
		System.out.println(myCar.model + "내차 속도는 "+ myCar.speed + "km");
	}


}
class Ex05{
	public static void main(String[] args){
		Car myCar;
		myCar = new Car();
		//myCar.maxSpeed = 150;
		//myCar.model = "아반떼";

		System.out.println(myCar.model + "내차 속도는 "+ myCar.speed + "km");

		for(int i = 0; i < 30; i ++){
		myCar.speedUp();
		System.out.println(myCar.model + "내차 속도는 "+ myCar.speed + "km");
		}

		for(int i = 0; i < 30; i ++){
		myCar.speedUp();
		System.out.println(myCar.model + "내차 속도는 "+ myCar.speed + "km");
		}
}
}