package com.sg.employee_encapsulation;

public class Employee {
	private int empId;
	public String empName;
	private double empSalary;
	private double mobileNumber;
	public static String companyName;
	
	public Employee(int empId)
	{
		if(empId>100)
		{
			this.empId=empId;
		}
		else
		{
			System.out.println("Invalid Employee Id - initialiazed with 0");
			
		}
		
	}
	
	
	
	//setter method
	public void setEmpSalary(double empSalary)
	{
		if(empSalary>0)
		{
			this.empSalary=empSalary;
		}
		else
		{
			System.out.println("Invalid Salary!!");
		}
	}
	
	public double getEmpSalary()
	{
		return this.empSalary;
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



	public double getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
//	public static Employee getEmployeeInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}

}


