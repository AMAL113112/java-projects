package oopspack;

class Test{
	int num=10;
	public void show(){
		System.out.println("inside show method");
	}
	static {
		Test obj=new Test();
		System.out.println("static block " +obj.num);//non static method can't be access
	}
	public static void display(){
		Test obj=new Test();
		System.out.println("static method " +obj.num);//static method can't be used
	}
}

public class TestDemo {

	public static void main(String[] args) {
		
		Test obj=new Test();
		obj.show();
        Test.display();
	}

}
