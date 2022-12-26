package com.bit;
//동적할당
//결론 : 배열이 더 좋다.
class Node{ //배열역할
	String val2;
	int val;
	Node nxt;
}

class Arr2{
	Node first;
	int cnt = 0;
	
	int size() {
		return cnt;
	}
	
	String get(int idx) { //idx 만큼 for 수행 //인원수 추가 
		Node temp = first;
		for (int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		return temp.val2;
	}
	void add(String su) {
		cnt++;
		//1.
		Node node = new Node();
		node.val2 = su;
		
		if(cnt == 1) {
			first = node;			
		}else {
			Node temp = first;
			while(true) {
				if(temp.nxt == null)break;
				temp = temp.nxt;			
		}
			temp.nxt = node;
		}

	}
}

public class Ex03 {

	public static void main(String[] args) {
		Arr2 arr = new Arr2();
		arr.add("22");
		arr.add("33");
		arr.add("44");
		arr.add("55");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
