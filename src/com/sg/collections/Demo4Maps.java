package com.sg.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Maps {
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("id", "E101");
		map.put("name", "john");
		map.put("mobile", "87887");
		map.put("mobile", "55");
		
		System.out.println(map.get("mobile"));
		
	}

}
