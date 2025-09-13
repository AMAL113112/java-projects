package oppspack.thispack;

class Student{
	int studentRollNo;
	String studentName;
	
	public Student(int studentRollNo, String studentName) {
		this.studentName=studentName;
		this.studentRollNo=studentRollNo;
	}
	void display() {
		System.out.println("namr:\t" +studentName);
		System.out.println("RollNo:\t" +studentRollNo);
	}
}

public class ThisInstanceVariableHiding {

	public static void main(String[] args) {
		Student obj=new Student(33,"abhi");
		obj.display();

	}

}
