package staticFinal;

class text{
	static final int AGE=23;
	
	void give() {
		System.out.println("maxium student allowed in a class: "+AGE);
	}
}

public class StaticFineInt {

	public static void main(String[] args) {
		// Access static final int directly (no object needed)
		System.out.println("maxium student allowed in a class: "+text.AGE);
		
		// Or using an object (still the same value)
		text tx=new text();
		tx.give();
		
		// Uncommenting the below line will cause ERROR (cannot change final variable)
        // Test.MAX_STUDENTS = 100;
	}

}
