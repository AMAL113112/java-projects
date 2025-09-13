package oopspack;

class Employee{
	private String name;
	private int age;
	
	public void setDetails(String n, int a) {
		name=n;
		age=a;
	}
	public void getDetails() {
		System.out.println("Name " + name);
		System.out.println("Age " + age);
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee();
		firstEmployee.setDetails("amal", 23);
        firstEmployee.getDetails();
		
	}

}
