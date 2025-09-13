package pratice;

class Job{
	String name;
	static String department;
	
	{ 
		System.out.println("Department of computer science");
	}
	Job(String Name){
		name=Name;
	}
	
	void display() {
		System.out.println(name+"-"+department);
	}
	
}

public class DemoTwoStatic {

	public static void main(String[] args) {
		Job.department="java Coding";
		Job obj=new Job("Luminar");
		
        obj.display();
       
	}

}
