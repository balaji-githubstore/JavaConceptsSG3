package com.sg.collections;

import java.util.ArrayList;
import java.util.List;

import com.sg.employee_constructor.Employee;
//size is dynamic
public class Demo2ArrayList {

	public static void main(String[] args) {
		
		
//		ArrayList lists=new ArrayList(); 
		List lists=new ArrayList(); 
		
		lists.add(10);
		lists.add(20.2);
		lists.add("Balaji");
		lists.add(new Employee());
		
		
		int a=(int) lists.get(0);
		
	}
}
