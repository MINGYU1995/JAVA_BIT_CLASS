import java.util.*;
class Ex06{

public static void main(String[] args){
	System.out.println("계산기(ver 0.1.0");
	Scanner scan = new Scanner(System.in);
	String msg = "";
	System.out.println("첫번째 숫자를 입력하시오");
	int su1  = scan.nextInt();
	System.out.println("두번째 숫자를 입력하시오");
	int su2 = scan.nextInt();
	int sum =0;
	System.out.println("1.+ 2.- 3.* 4./ ");
	int input = scan.nextInt();

	switch(input){
	case 1 : 	sum = su1+su2;
		msg = "+";
		break;
	case 2 : sum = su1-su2;
		msg = "-"; 
		break;
	case 3 : sum = su1*su2;
		msg = "*"; 
		break;
	case 4 : sum = su1/su2;
		msg = "/";
		break;
	}

	System.out.println(su1 + msg + su2 + " = " + sum);		

}
}