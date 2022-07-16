package com.sg.employee_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		
		Employee.companyName="SG";
		
		Employee emp1=new Employee(101);
		Employee emp2=new Employee(102);
		Employee emp3=new Employee(103);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
			
//		emp1.empId=101;
		emp1.empName="John";
//		emp1.empSalary=-5600.20;
		
		emp1.setEmpSalary(-90);
	
//		emp2.empId=102;
		emp2.empName="Peter";
//		emp2.empSalary=600;
		
		emp2.setEmpSalary(1000);
		
		System.out.println(emp2.getEmpSalary());

		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();

	}

}







