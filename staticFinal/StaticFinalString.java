package staticFinal;

class course{
	static final String CLASS_NAME="JAVA FULL STACK";
	
	void show() {
		System.out.println("course name: "+CLASS_NAME);
	}
}

public class StaticFinalString {

	public static void main(String[] args) {
		//Access static final directly using class name (no object needed)
		System.out.println("course name: "+course.CLASS_NAME);

		// Or use object (but not required)
		course crs=new course();
		crs.show();
	}

}
