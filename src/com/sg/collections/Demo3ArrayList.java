package com.sg.collections;

import java.util.ArrayList;
import java.util.List;

import com.sg.employee_constructor.Employee;
//size is dynamic
public class Demo3ArrayList {

	public static void main(String[] args) {
		
		
		List<String> colors=new ArrayList<String>(); 
		
		colors.add("red");
		colors.add("blue");
		colors.add("orange");
		colors.add("black");
		
		System.out.println(colors);
		System.out.println(colors.size());
		
		colors.remove("orange");
		
		colors.add(0, "green");
		
		System.out.println(colors);
		System.out.println(colors.get(1));
		System.out.println(colors.size());
		
		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers.get(1));
		System.out.println(numbers.size());
	
		
	}
}
