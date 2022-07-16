package com.sg.collections;

import com.sg.employee_constructor.Employee;

public class Demo1Object {
	
	public static void main(String[] args) {
		
//		int a=10;
//		double b=10.2;
//		String c="hello";
//		Employee e=new Employee();
		
		
		Object z1=10; //boxing
		Object z2=10.2;//boxing
		Object z3="hello";//boxing
		Object z4=new Employee();//boxing
		
		String x=(String) z3; //unboxing
		
		System.out.println(x);
		
		int y=(int) z1;//unboxing
		System.out.println(y+y);
		
		Employee h=(Employee) z4; //unboxing
		h.printEmployeeDetail();
		
//		int k=(int) z4;
	}

}
