

class Ex07{

public static int su1=1111;
public int su2 = 2222;
public void func01(){
	int su2 = 5555;
	System.out.println("지역변수 su2 =" + su2);
	System.out.println("전역변수 su2 =" + this.su2);
}
public void func02(int su2){
	this.su2=su2;
}
public static void main(String[] args){
	int su1 = 3333;
	int su3 = 4444;
	// 지역변수 > 전역변수
	System.out.println("지역변수 su1 =" + su1);
	System.out.println("전역변수 su1 =" + Ex07.su1);
	int su2=4444;
	Ex07 me = new Ex07();
	me.func02(6666);
	me.func01();
	//System.out.println("지역변수 su1 =" + su2);
	//System.out.println("전역변수 su1 =" + me.su2);

}


}