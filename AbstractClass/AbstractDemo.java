package AbstractClass;

abstract class Graphic{
	
	int no=50; //non static data member
	static String str="amal";//static data member
	abstract void showShape();
	
	void area(int num) {//non static
		System.out.println(num);
	}
	static void displayObject() {//static method
		System.out.println("graphic object");
	}
		
}
class Circle extends Graphic{//sub class
	
	@Override
	void showShape() {
		System.out.println("circle");
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Graphic graphic=new Circle();
		//Circle obj=new Circle();
		
		
		graphic.showShape();//implemented abstract method
		graphic.area(45);//inherited non static method in abstract class
		System.out.println(graphic.no);//non static data member
		
		Graphic.displayObject();
		System.out.println(Graphic.str);//static variable
		
		
	}

}
