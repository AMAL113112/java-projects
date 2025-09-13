package pratice;

import java.util.Scanner;

class Doctor{
	private int id;          // Stores the doctor's ID (a whole number)
    private String name;     // Stores the doctor's name
    private String specialization; // Stores the doctor's specialization

    // Constructor with parameters (for Doctor 1)
    public Doctor(int doctorId, String doctorName, String doctorSpecialization) {
        id = doctorId;              // Assigns the ID parameter to the id field
        name = doctorName;          // Assigns the name parameter to the name field
        specialization = doctorSpecialization; // Assigns the specialization parameter
        System.out.println("Doctor 1 - ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
	//For Doctor two
	public void save(int saveId, String saveName, String saveSpecialization) {
        id = saveId;                // Sets the ID
        name = saveName;            // Sets the name
        specialization = saveSpecialization; // Sets the specialization
    }

    // Method to print details (for Doctor 2)
    public void print() {
        System.out.println("Doctor 2 - ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }

    // Setter methods (for Doctor 3)
    public void setId(int newId) {
        id = newId;                // Sets the ID
    }

    public void setName(String newName) {
        name = newName;            // Sets the name
    }

    public void setSpecialization(String newSpecialization) {
        specialization = newSpecialization; // Sets the specialization
    }

    // Getter methods (for Doctor 3)
    public int getId() {
        return id;                 // Returns the ID
    }

    public String getName() {
        return name;               // Returns the name
    }

    public String getSpecialization() {
        return specialization;     // Returns the specialization
    }
	
}

public class Hospital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter the id no for doctor1");
		 int id1=sc.nextInt();
		 sc.nextLine();
		 System.out.println("enter the name for Doctor1: ");
		 String name1 = sc.nextLine();     // Reads the name
	        System.out.print("Enter Specialization for Doctor 1: ");
	        String spec1 = sc.nextLine();     // Reads the specialization
	        Doctor doctor1 = new Doctor(id1, name1, spec1); // Creates Doctor 1

	        // Doctor 2: Using save() and print()
	        System.out.print("Enter ID for Doctor 2: ");
	        int id2 = sc.nextInt();
	        sc.nextLine();                    // Clears the extra enter
	        System.out.print("Enter Name for Doctor 2: ");
	        String name2 = sc.nextLine();
	        System.out.print("Enter Specialization for Doctor 2: ");
	        String spec2 = sc.nextLine();
	        Doctor doctor2 = new Doctor(0, "", ""); // Starts with empty values
	        doctor2.save(id2, name2, spec2);       // Saves the details
	        doctor2.print();                       // Prints the details

	        // Doctor 3: Using getters and setters
	        System.out.print("Enter ID for Doctor 3: ");
	        int id3 = sc.nextInt();
	        sc.nextLine();                    // Clears the extra enter
	        System.out.print("Enter Name for Doctor 3: ");
	        String name3 = sc.nextLine();
	        System.out.print("Enter Specialization for Doctor 3: ");
	        String spec3 = sc.nextLine();
	        Doctor doctor3 = new Doctor(0, "", ""); // Starts with empty values
	        doctor3.setId(id3);                    // Sets the ID
	        doctor3.setName(name3);                // Sets the name
	        doctor3.setSpecialization(spec3);      // Sets the specialization
	        System.out.println("Doctor 3 - ID: " + doctor3.getId() + ", Name: " + doctor3.getName() + ", Specialization: " + doctor3.getSpecialization());

	        // New: Summary of all doctors
	        System.out.println("\nHospital Doctor Summary:");
	        System.out.println("Doctor 1 - ID: " + doctor1.getId() + ", Name: " + doctor1.getName() + ", Specialization: " + doctor1.getSpecialization());
	        System.out.println("Doctor 2 - ID: " + doctor2.getId() + ", Name: " + doctor2.getName() + ", Specialization: " + doctor2.getSpecialization());
	        System.out.println("Doctor 3 - ID: " + doctor3.getId() + ", Name: " + doctor3.getName() + ", Specialization: " + doctor3.getSpecialization());

	        sc.close();

	}

}
