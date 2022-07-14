package com.sg.employee_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee.companyName="SG";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(102,"John");
		Employee emp3=new Employee("king",103);
				
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
			
		emp1.empName="John";
		emp1.empSalary=5600.20;
	
		emp2.empName="Peter";
		emp2.empSalary=600;
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
		

		
	}

}







