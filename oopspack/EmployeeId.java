package oopspack;

class office{
	
	String name="amal";
	int age=23;
	
	public void getDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}

public class EmployeeId {

	public static void main(String[] args) {
		office firstEmployee=new office();
		
		firstEmployee.getDetails();
	}

}
