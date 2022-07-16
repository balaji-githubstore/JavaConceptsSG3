package com.sg.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		
		Employee.companyName="SG";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		Employee emp4=Employee.getEmployeeInstance();
		Employee emp5=Employee.getEmployeeInstance();
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
			
//		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=-5600.20;
	
//		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=600;
		
//		Employee.displayEmployeeDetail(emp2);
//		Employee.displayEmployeeDetail(emp1);
//		Employee.displayEmployeeDetail(emp3);
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
		
//		Employee[] employees=new Employee[3];
//		employees[0]=emp1;
//		employees[1]=emp2;
//		employees[2]=emp3;
//		
//		System.out.println(emp3.empId);
//		System.out.println(employees[2].empId);
//		System.out.println(emp3);
//		System.out.println(employees[2]);
		System.out.println("---------------------------");
		
		Employee empz=Employee.getEmployeeInstance();
		Employee.displayEmployeeDetail(empz);
		
	//	Employee.displayEmployeeDetail(Employee.getEmployeeInstance());
		
		Employee.getEmployeeInstance().printEmployeeDetail();
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(Employee.getEmployeeInstance());
		
		System.out.println();
	}

}







