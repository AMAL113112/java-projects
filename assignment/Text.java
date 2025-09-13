package assignment;

class demo{
	public final String COURSE_NAME="java spring boot";
	
	
	
	public void print() {
		System.out.println(COURSE_NAME);
	}
}

public class Text {

	public static void main(String[] args) {
		demo dd=new demo();
		dd.print();
		
		demo d2=new demo();
		d2.print();
		
		//dd.set("luminar");
		
		dd.print();
		d2.print();
	}

}
