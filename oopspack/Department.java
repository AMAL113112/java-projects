package oopspack;

class Admin{
	//attributes
	int adminId;
	String adminName;
	float adminSalary;
	double adminBouns;
	
	Admin(int id, String name){
		adminId=id;
    	adminName=name;
	}
	
	//new to me //this is to add the obj1 value to the obj2
	Admin(Admin other) {
        adminId = other.adminId;
        adminName=other.adminName;
    }
	
	Admin(){
		adminId=34;
		adminName="abhi";
	}
	Admin(int id, String name, float salary, double bouns){
		adminId=id;
		adminName=name;
		adminSalary=salary;
		adminBouns=bouns;
	}
	
	void printDetails() {
		System.out.println("id is: "+adminId+" name is: "+adminName);
	}
	void printSet() {
		System.out.println("id is: "+adminId+" name is: "+adminName+" salary is: "+adminSalary+" bouns is: "+adminBouns);
	}
}

public class Department {

	public static void main(String[] args) {
		Admin obj1=new Admin(23, "Arun");
        obj1.printDetails();
        
        Admin obj2=new Admin(obj1);
		obj2.printDetails();
		
		Admin obj3=new Admin();
		obj3.printDetails();
		
		Admin obj4=new Admin(24,"priya",4500.06f,5000);
		obj4.printSet();
	}

}
