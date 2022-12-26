package com.bit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		java.util.List list;
		list = new ArrayList(); //Array 배열로 만든것
		list = new LinkedList(); // 노드로 만든것 
		java.util.Queue que;
		que = new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(4444);
//		while(que.peek()!=null) {
//			System.out.println(que.peek());
//			que.poll();
//		}
		int cnt = 0;
		while(que.peek()!=null) {
			System.out.println(++cnt);
			System.out.println(que.poll());
			System.out.println(que.poll());
		}
//		System.out.println(que.poll()+"제거");
//		System.out.println(que.poll()+"제거");
//		System.out.println(que);
		//System.out.println(que.peek());
	//	System.out.println(que.poll());
		//System.out.println(que.peek());
		//System.out.println(que.poll());
		//System.out.println(que.poll());
	//	System.out.println(que.poll());
	}

}





