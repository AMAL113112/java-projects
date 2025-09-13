package Inheritancepack;

class EmployeeDetails{
	int empId=50;
	public void printId() {
		System.out.println(empId);
	}
}
class Manager extends EmployeeDetails{
	String name="amal";
	void printName() {
		System.out.println(name);
	}
}
class AssistanceManager extends Manager{
	String designation="asst. Manager";
	
	public void printDesignation() {
		System.out.println(designation);
	}
	
}

public class Employee {

	public static void main(String[] args) {
		
		Manager manager=new Manager();
		
		//System.out.println(manager.empId);
		//System.out.println(manager.name);
		
		manager.printId();
		manager.printName();
		
		AssistanceManager obj=new AssistanceManager();
		System.out.println("AssistanceManager");
		obj.printId();
		obj.printName();
		obj.printDesignation();
	}

}
