package com.sg.datatypes;

public class Demo1Datatypes {
	
	public static void main(String[] args) {
		
		byte a=100;
		a=120;
		short b=100;
		int c=100;
		
		long d=84555458787L;
		
		//1000 student percentage - 0 to 100
		//byte - 1000 * 8 bits = 8000 bits of memory occupied 
		//int - 1000*32 = 32000 bits of memory occupied 
		
		float e=3.14f;
		
		double f=10.2;
		
		int res=a+b;
		System.out.println(res);
		
		System.out.println(10.2);
		

		System.out.println(b);
		
		System.out.println(11/2);
		
		double output = 11/(double)2;
		System.out.println(output);
		
		float x=10.2f; //will allocated 32 bits of memory
		
		double y=x; //32bits to 64 bits of memory // implicit conversion - no dataloss
		
		double j=1.123456789;
		System.out.println(j);
		float i= (float) j;  //64bit to 32 bit of memory //explicit coversion - lead to dataloss
		System.out.println(i);
		
		char letter='&'; //16bits of memory
		System.out.println(letter);
		
		boolean check=true; 
		System.out.println(check);
		
		//non-predefined 
		String name="Balaji"; //6*16 bits of memory occupied 
		System.out.println(name);
		
		String uName= name.toUpperCase();
		System.out.println(uName);
		
		char letter1= name.charAt(10);
		System.out.println(letter1);
		//array
		
		
	}
}





