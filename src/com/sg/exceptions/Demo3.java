package com.sg.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//will be deleted
public class Demo3 {

	public static void main(String[] args) {
		
		try {
			
			int[] numbers=new int[3];
			
			numbers[1]=45; //new ArrayINdexOutOfException()
			
			FileInputStream file=new FileInputStream("testdata/orange_testdata123.xlsx"); //new FileNotFoundException()
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		finally {
			//run always
		}
		System.out.println("helo");

	}

}
