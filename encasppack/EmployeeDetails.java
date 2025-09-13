package encasppack;

class Employee{
	private int empId;
	private String empname;
	
	public int getEmpId() {//getter method
		return empId;
	}
	public void setEmpId(int empId) {//setter method
		this.empId = empId;
	}
	public String getEmpname() {//getter method
		return empname;
	}
	public void setEmpname(String empname) {//setter method
		this.empname = empname;
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmpId(123);
		employee.setEmpname("amal");
		
		System.out.println("employee ID is: "+employee.getEmpId());
        System.out.println("employee name is: "+employee.getEmpname());
	}

}
