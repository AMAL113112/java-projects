package pratice;

class Department{
	String departmentName;
	
	Department(String departmentName){
		this.departmentName=departmentName;
	}
}
class employee{
	int id;
	String name;
	Department dept;
	
	employee(int id, String name, Department dept){
		this.id = id;
        this.name = name;
        this.dept = dept;
	}
	void display() {
		System.out.println("Department: "+dept.departmentName);
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
	}
	
}

public class ThisParameter {

	public static void main(String[] args) {
		Department obj=new Department("IT");
		
		employee obj2=new employee(8979,"amal ",obj);
		
		obj2.display();
		

	}

}
