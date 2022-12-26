package com.bit;
import java.util.*;
public class Ex07 {
//컬렉션 을 사용하면서 어떤 타입을 사용할지 제네릭을 이용하여 구분하자?.
	public Box<? super Integer> func(int su){
		if(su>0) 
			return new Box<Number>();
		else
			return new Box<Integer>();
	}
	
		
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		Box<String> box1 = new Box();
		Box box2 = new Box<String>();
		Box<String> box3 = new Box<>();
		Box<?> box4 = new Box<String>();
		((Box<String>)box4).setSu("");
	}

}
