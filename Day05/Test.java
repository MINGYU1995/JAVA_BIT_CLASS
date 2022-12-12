import java.util.*;

public interface Fizzbuzz {	//인터페이스 정의
	void print(int from ,int to); 
		
}
public class ConsoleBasedFizzBuzz implements FizzBuzz {
	// FizzBuzz 인터페이스 구현 
	public int a = 1;
	public void print(a, int n) {
		for(int i = 1; i < n ; i++){
			System.out.println("-");
		}
		return i ;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	ConsoleBasedFizzBuzz cb = new ConsoleBasedFizzBuzz();
	cb.print(a,num);
	System.out.print(i);

	//main 메서드 사용 
	1부터 max 까지 fizz buzz 출력
	max는 콘솔로부터 전달받음. 
}