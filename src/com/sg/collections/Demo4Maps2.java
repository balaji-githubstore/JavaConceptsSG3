package com.sg.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Maps2 {
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("firstname", "John");
		map.put("middlename", "K");
		map.put("lastname", "wick");
		map.put("employee_id", "890");
		map.put("photograph", "emp_809.png");
		
		
		System.out.println(map.get("employee_id"));
		
	}

}
