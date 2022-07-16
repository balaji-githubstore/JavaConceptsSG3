package com.sg.oops;

abstract class Employee
{
	public int empId;
	public String empName;
	
	public void printEmployeeDetails() {
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public abstract void calculateSalary();
}

class PermanentEmployee extends Employee
{
	public void calculateSalary()
	{
		System.out.println(30*1000);
	}
}

class ContractEmployee extends Employee
{
	public void calculateSalary()
	{
		System.out.println(8*1000*20);
	}
}

public class AbsDemo {
	public static void main(String[] args) {
		
		Employee e=new PermanentEmployee();
		e.printEmployeeDetails();
		e.calculateSalary();
		
		e=new ContractEmployee();
		e.printEmployeeDetails();
		e.calculateSalary();
	}

}




