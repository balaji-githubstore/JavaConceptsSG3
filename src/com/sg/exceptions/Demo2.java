package com.sg.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//will be deleted
public class Demo2 {

	public static void main(String[] args) {
		
		try {
			int a =10;
			int b=0;
			
			System.out.println(a/b); //new ArithmeticException:()
			
			FileInputStream file=new FileInputStream("testdata/orange_testdata.xlsx"); //new FileNotFoundException()
		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			//run always // excel close 
		}
		

	}

}
