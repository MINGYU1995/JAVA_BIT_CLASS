package com.bit;
import java.util.*;
class Lec12 implements Comparable{ //내가 0이 아닌 값을 넣으면 다른 값이 되어버린다.?내가 비교를 하고싶은  value 가 있겠지
	int val = 1;				
	
	public Lec12(int su) {		//찍어내는 객체마다 값을 다르게 주기 위해 이 생성자를 생성. 
		val = su;
	}
	@Override
	public int compareTo(Object o) { //순서의 결정은 얘가 한다.
			//들어오는 순간 이진트리가 나를 기준으로 좌우 결정.
		// TODO Auto-generated method stub
		return ((Lec12)o).val-val; //음수냐 양수냐에 따라 좌우를 결정한다. 음수면 좌측 양수면 우측
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

public class Ex12 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(new Lec12(1111));
		set.add(new Lec12(4444));
		set.add(new Lec12(3333));
		set.add(new Lec12(2222));
		set.add(new Lec12(3333));
		//set.add(me);
		//set.add(new Lec12());
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object obj = ite.next();	
			System.out.println(obj.toString());
		}
	}

}
