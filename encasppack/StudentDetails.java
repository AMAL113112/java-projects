package encasppack;

class Student{
	
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNO(int rollNo) {
		this.rollNo=rollNo;
	}
	
	public String giveName() {
		return name;
		
	} 
	
	public void printName(String name) {
		this.name=name;
	}
	
	
}

public class StudentDetails {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNO(32);
		student.printName("amal");
		
		System.out.println("roll number is: "+student.getRollNo());
		System.out.println("name os the student: "+student.giveName());

	}

}
