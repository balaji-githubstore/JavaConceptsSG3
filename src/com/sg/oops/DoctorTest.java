package com.sg.oops;

import javax.print.Doc;

 class Doctor
{
	public int docId;
	public String name;
	public String hospitalName;

	public void printhospitalAddress()
	{
		System.out.println("CHe 334");
	}
	
	public void treatment()
	{
		System.out.println("treats for fever, cold!!");
	}
}

class Dentist extends Doctor
{
	public void treatment()
	{
		System.out.println("treats tooth related issue");
	}
	
}

class Vetenary extends Doctor
{
	public void treatment()
	{
		System.out.println("treats animal");
	}
}

class Cardiologist extends Doctor
{
	public void treatment()
	{
		System.out.println("Cardio related ");
	}
}

public class DoctorTest {
	
	public static void payRoll(Doctor x)
	{
		System.out.println(x.name);
		System.out.println("Salary "+98989);
	}
	
	public static void main(String[] args) {
		
	   Doctor d=new Dentist();
	   d.docId=101;
	   d.name="john";
	   
	   d.printhospitalAddress();
	   d.treatment();
	   
	   d=new Cardiologist();
	   
	   DoctorTest.payRoll(d);
		
	   Doctor d1 =new Vetenary();
	   d1.printhospitalAddress();
	   d1.treatment();
	   
	   DoctorTest.payRoll(d1);
	   
	   DoctorTest.payRoll(new Doctor());
	   DoctorTest.payRoll(new Dentist());
	   DoctorTest.payRoll(new Vetenary());
	}

}



