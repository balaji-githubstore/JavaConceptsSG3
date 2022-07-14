package com.sg.methods;

import com.sg.formula.Area;

public class MethodsDemo {

	public static void main(String[] args) 
	{
		//allocating memory for all non-static methods,variable
		
		Area obj= new Area();

		double result = obj.areaOfCircle(10);
		System.out.println(result);
		
		result = obj.areaOfCircle(20);
		System.out.println(result);
		
		result=Area.areaOfRectangle(10, 10);
		System.out.println(result);
		
		//System.out.println(MethodsDemo.areaOfRectangle(10, 10));
		
		result=obj.areaOfTriangle(25, 1);
		System.out.println(result);
		
		
		double randomNumber= Math.random();
		System.out.println(randomNumber);
		
		//pow,sqrt from Math class 
		
		String name=Area.getAuthorName();
		System.out.println(name);
		
		Area.printClassDescription();

	}

}
