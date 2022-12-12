import java.util.*;
class Ex06_6{
public static int sum = 0;
public static void main(String[] args){
	String msg = "";
	Scanner scan = new Scanner(System.in);
  	
	System.out.println("첫수");
	int su1 = scan.nextInt();
	
	System.out.println("두수");
	int su2 = scan.nextInt();
	
	System.out.println("기호");

	int input = scan.nextInt();
	
	switch(input){	
	case 1 : System.out.println(su1 + "+" + su2 + "=" + add(su1,su2));		
	          break;
	case 2 : System.out.println(su1 + "+" + su2 + "=" + min(su1,su2));		
	          break;
	case 3 : System.out.println(su1 + "+" + su2 + "=" + mul(su1,su2));		
	          break;
	case 4 : System.out.println(su1 + "+" + su2 + "=" +  div(su1,su2));		
	          break;
	}
	
}




public int add(int a, int b){	
	return sum = a+b;
}
public int min(int a, int b){	
	return sum = a-b;
}
public int mul(int a, int b){	
	return sum = a*b;
}
public int div(int a, int b){	
	return sum = a/b;
}



}