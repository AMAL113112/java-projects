package firstPack;

import firstPack.sub.Employee;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		emp.setEmpId(321);  
		emp.setEmpName("amal");
		
		System.out.println("Employee Id: "+emp.getEmpId());
        System.out.println("Employee Name: "+emp.getEmpName());
	}
}