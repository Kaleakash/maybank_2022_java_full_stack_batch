package com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		LinkedHashMap hm = new LinkedHashMap();
		hm.put(2, "Ravi");
		hm.put(1, "Ravi");
		hm.put(4, "Ajay");
		hm.put(3, "Vijay");
		hm.put(3, "Lokesh");
		hm.put("A", 2);
		System.out.println(hm);
		System.out.println("Get value "+hm.get(2));
		System.out.println("Get value "+hm.get("A"));
		if(hm.containsKey("A")) {
				System.out.println("key present");
		}else {
				System.out.println("key not present");
		}
	}

}
