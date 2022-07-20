package com.sg.datatypes;

public class Demo2Array {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		int[] numbers=new int[5]; //5*32 bits of memory allocated 
		
//		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		
		numbers=new int[6]; //6*32
		System.out.println(numbers);
	
		
		
		double[] arr=new double[4]; //64*4 bits of memory allocated 
		arr[0]=10.2;
		arr[1]=10.3f;
		arr[2]=10;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//create an array for storing chrome, firefox, edge 
		
		String[] browsers=new String[3]; 
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="edge";
		
		
		
		System.out.println(browsers);
		System.out.println(browsers[0]);
		
		int[] arr2= {10,20,50,88,66};
		System.out.println(arr2[2]);
		
		String[] browsers1= {"ff","ch","edge"};
		
		Object[] arr5=new Object[3];
		arr5[0]=45;
		arr5[1]=45.2;
		arr5[2]="hello";
	}

}
