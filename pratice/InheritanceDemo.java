package pratice;

class Parent{
	 
	String communication;
	String behaviour;
	
	Parent(String communication, String behaviour){
		this.communication=communication;
		this.behaviour=behaviour;
	}
	public void show() {
		System.out.println("Age: "+communication);
		System.out.println("Name: "+behaviour);
	}	
}
class Baby extends Parent {
	String fighting;
	String flirting;
	
	Baby(String communication, String behaviour, String fighting, String flirting){
		super(communication, behaviour);  // Initialize parent fields
        this.fighting = fighting;         // Initialize child fields
        this.flirting = flirting;
	}
	@Override
	public void show() {
		//first call parents version
		super.show();
		
		System.out.println("Fighting: "+fighting);
		System.out.println("Flirting: " + flirting);
	}
	
}
class GrandChild extends Baby{
	String hobby;
	String favFood;
	GrandChild(String communication, String behaviour, String fighting, String flirting, String hobby, String favFood){
	super(communication, behaviour, fighting, flirting);
	this.hobby=hobby;
	this.favFood=favFood;
}
	@Override
	public void show() {
		super.show();
		System.out.println("Hobby: " + hobby);
		System.out.println("Favourite food: "+favFood);
	}
}	
public class InheritanceDemo {
 
	public static void main(String[] args) {
		
		Parent p = new Parent("Good","Calm");
		Parent c = new Baby("Good", "Calm", "Aggressive", "Romantic");
		Parent gc=new GrandChild("Good", "Calm", "Aggressive", "Romantic", "Gaming", "biriyani" );
        
		System.out.println("---parent object---");
		p.show();
		
		System.out.println("---child object---");
		c.show(); // Will call Child's overridden show() (with parent's info + child's info)
        
		System.out.println("---GrandChild Object---");
        gc.show();
	}

}
