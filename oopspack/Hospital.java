package oopspack;

class Doctor{
	int id;
    String name;
	String specialization;
	
	Doctor(int i, String n, String s){
		id=0;
		name="";
		specialization="";
	}
	void save(int i, String n, String s) {
		id=i;
		name=n;
		specialization=s;
	}
	
	void print() {
		System.out.println(id+" "+name+" "+specialization);
	}
	void setDetails(int i, String n,String s) {
		id=i;
		name=n;
		specialization=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+specialization);
	}
}
public class Hospital {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor(0,"","");
		d1.save(1, "Dr. Amal", "Cardiology");
		
		Doctor d2 = new Doctor(0,"","");
		d2.save(2, "Dr. Hari", "Neurology");

        
        Doctor d3 = new Doctor(0,"",""); 
        d3.setDetails(3, "Dr. Anu", "Pediatrics");

        // Print all doctors
        System.out.println("--- Doctor Details ---");
        System.out.println("Doctor 1:");
        d1.print();
        System.out.println("Doctor 2:");
        d2.print();

        System.out.println("Doctor 3:");
        d3.display();
	}

}
