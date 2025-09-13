package superPack;

class person{
	String name="amal";
	int emp=123;
	float bones=5000f;
}
class student extends person{
	String name="hair";
	float salary=56790.7f;
	
	void show() {
		System.out.println("parent name: "+super.name);
		System.out.println("child name: "+name);
		System.out.println("Employee ID: " + emp);
		System.out.println("Salary: " + salary);
		System.out.println("bones: "+super.bones);
	}
}

public class SuperSubVariabils {

	public static void main(String[] args) {
		student s1 = new student();
        s1.show();

	}

}
