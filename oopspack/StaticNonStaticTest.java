package oopspack;

public class StaticNonStaticTest {
	String name;
	static String name2;
	static{
		  name2="amal";
		System.out.println("========");
	}
	void details(String name2) {
		StaticNonStaticTest.name2=name2;
	}
	void setName(String name) {
		this.name=name;
	}
	
	void print() {
		System.out.println("name is: "+name);
	}
	static void printStatic() {
		System.out.println("Static name is: "+name2);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		StaticNonStaticTest obj=new StaticNonStaticTest();
		
		obj.setName("amal");
		obj.print();
		obj.details("hari");
		StaticNonStaticTest.printStatic();
	}

}
