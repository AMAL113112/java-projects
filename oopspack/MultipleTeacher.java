package oopspack;

class Details{
	int id;
	String name;
	double salary;
	
	public void setDetails(int tId, String tName, double tSalary ) {
		id=tId;
		name=tName;
		salary=tSalary;
	}	
	
	void printDetails() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class MultipleTeacher {

	public static void main(String[] args) {
         Details obj1=new Details();
         Details obj2=new Details();
         Details obj3=new Details();
         
         obj1.setDetails(1, "amal", 45000);
         obj2.setDetails(2, "hari", 46000);
         obj3.setDetails(3, "anu", 47000);
         
         obj1.printDetails();
         obj2.printDetails();
         obj3.printDetails();
	}

}
