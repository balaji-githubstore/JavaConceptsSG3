package com.sg.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public static void displayEmployeeDetail(Employee x)
	{
		System.out.println(x);
		System.out.println(x.empId);
		System.out.println(x.empSalary);
		System.out.println(x.empName);
		System.out.println(Employee.companyName);
		System.out.println("--------------------");
	}
	
	//non-static methods
	public void printEmployeeDetail()
	{
//		empId=9000;
		System.out.println(this);
		System.out.println(this.empId);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("--------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}

}


