package finalpack;

class Employee{
	
	public final void show(){
		System.out.println("hello");
	}
}
class Accountent extends Employee{
	String name;
	//public void show() {	
	//}
	Accountent(String name){
		super();
		this.name=name;
	}
	
	public void display() {
		System.out.println(name);
	}
	
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.show(); 

		Accountent ac=new Accountent("amal");
		ac.display();
		
	}
 
}
