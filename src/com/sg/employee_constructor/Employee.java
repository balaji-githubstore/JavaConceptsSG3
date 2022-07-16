package com.sg.employee_constructor;

public class Employee {
	private int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee()
	{
		System.out.println("Object created");
	}
//	
	public Employee(int empId)
	{
		this.empId=empId;
	}
	
	public Employee(double empSalary)
	{
		this.empSalary=empSalary;
	}
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public Employee(String empName,int empId)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public void printEmployeeDetail()
	{

		System.out.println(this);
		System.out.println(this.empId);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("--------------------");
	}
}


