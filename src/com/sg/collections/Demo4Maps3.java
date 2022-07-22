package com.sg.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4Maps3 {
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("firstname", "John");
		map.put("middlename", "K");
		map.put("lastname", "wick");
		map.put("employee_id", "890");
		map.put("photograph", "emp_809.png");
		
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("firstname", "John1");
		map1.put("middlename", "K3");
		map1.put("lastname", "wick33");
		map1.put("employee_id", "89023");
		map1.put("photograph", "emp_8092323.png");
		
		
		List<Map<String, String>>  lists=new ArrayList<Map<String, String>>();
		lists.add(map);
		lists.add(map1);
		
		
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("lastname"));
		
	}

}
