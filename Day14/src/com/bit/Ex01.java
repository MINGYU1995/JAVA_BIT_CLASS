package com.bit;
import java.util.*;
import java.util.Map.Entry;
public class Ex01 {

	public static void main(String[] args) {
		Map map = new TreeMap();
		
		map.put("ke1", "key1");
		map.put("key", 1234);
		map.put("key3", 'a');
		map.put("key4", true);
		map.put("key5", null);
		
		System.out.println("size:");
		
		Collection list = map.values();
		
		Iterator ite = list.iterator();
		while(ite.hasNext())
				System.out.println(ite.next());;
		
		
		
	}

}
