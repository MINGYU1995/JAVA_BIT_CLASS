class Car{ //I 참고 I this와 this（）는 비슷하게 생겼을 뿐 완전히 다른 것이다. this는 ‘참조 변수’이고, this（fe ‘생성자’이다
	public int speed;
	public int maxSpeed;
	public String model;
	public Car(){
		this.model = "기본차";
		this.maxSpeed = 150;
	}
	public Car(int maxSpeed){
		this();
		this.maxSpeed = maxSpeed;
	}	
	public Car(int maxSpeed, String model){
		this();	//최상단에 있어야 한다. 
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
}
class Ex08{

public static void main(String[] args){

	Car car2 = new Car();
	System.out.println(car2);

	}
}