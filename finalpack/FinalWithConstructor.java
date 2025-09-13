package finalpack;

class person{
	final String name;
	final int age;
	 
	person(String name, int num){
		this.name=name;
		this.age=num;
	}
	public void display() {
		System.out.println("Name: "+ name+"\nage: "+age);
	}
}
class student extends person{
	final String course;
	
	student(String name, int age, String course){
		super(name, age);
		this.course=course;
	}
	public void display() {
		super.display();
		System.out.println("course: "+course);
	}
}

public class FinalWithConstructor {

	public static void main(String[] args) {
		
		
		student st=new student("amal",23,"java full stack");
		st.display();
	}

}
