package pratice;

abstract class reful{
	String name;
	
	reful(String name){
		this.name=name;
	}
	void print() {
		System.out.println("pratrol");
	}
}
interface Car{
	void move();
	
}
interface bike{
	void move();
}
interface boat{
	void move();
}
interface airplane{
	void move();
}
class road extends reful implements Car{
	road(String name){
		super(name);
	}
	@Override
	public void move() {
		System.out.println(name+" travils on rode");
		print();
	}
	
}
class rod extends reful implements bike{
	rod(String name){
		super(name);
	}
	@Override
	public void move() {
		System.out.println(name+" travils on rode");
		print();
	}
}
class water extends reful implements boat{
	water(String name){
		super(name);
	}
	@Override
	public void move(){
		System.out.println(name+" travels on water");
		print();
	}
}
class air extends reful implements airplane{
	air(String name){
		super(name);
	}
	@Override
	public void move(){
		System.out.println(name+" travels on air");
		print();
	}
}

public class QuestionMultiInterfaceAbstractClass {

	public static void main(String[] args) {
		road r=new road("car");
		r.move();
		
		rod r2=new rod("bike");
		r2.move();
 
		water w=new water("boat");
		w.move();
		
		air a=new air("airplane");
		a.move();
		
		String[] colors= {"red","yellow","green"};
		
		for(String c: colors) {
			System.out.println("traffic singnal is "+c);
			if (c.equals("red")) {
		        System.out.println("STOP!");
		    } else if (c.equals("yellow")) {
		        System.out.println("READY!");
		    } else if (c.equals("green")) {
		        System.out.println("GO!");
		    }
		}
		
	}

}
