package oopspack;

class Teacher{
	int id;
	String name;
	double salary;
	
	public void saveDetils(int num,String detalis, double amount) {
		id=num;
		name=detalis;
		salary=amount;
	}	
		public void printDetails() {
			System.out.println(id+" "+name+" "+salary);
		}
	
}
public class TeacherDetails {

	public static void main(String[] args) {
		
		Teacher obj1=new Teacher();
		Teacher obj2=new Teacher();
		
		obj1.saveDetils(1, "amal", 45000);
		obj2.saveDetils(2, "hari", 46000);
		
		obj1.printDetails();
		obj2.printDetails();

	}

}
