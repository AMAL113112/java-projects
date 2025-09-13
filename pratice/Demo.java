package pratice;

class Student{
	String name;
	static String school;
	{
		name="amal";
	}	
	void display(){
		System.out.println(name+"-"+school);
	}
}
public class Demo {

	public static void main(String[] args) {
		Student.school="pilicode";
		Student obj=new Student();
		obj.display();

	}

}
