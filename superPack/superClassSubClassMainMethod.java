package superPack;

class Employees{
	public void print() {
		System.out.println("sir");
	}
	void showDetails() {
		System.out.println("amal");
		System.out.println("student");
	}
}
class managers extends Employees{
	public void display(){
		System.out.println("hello");
	}
	void showDetails() {
		System.out.println("hari");
		System.out.println("manager");
	}
	void show() {
		//super.showDetails();//not necessary to be the first
		showDetails();//child class
		super.showDetails();
	}
}
public class superClassSubClassMainMethod {

	public static void main(String[] args) {
		managers md=new managers();
			md.show();
			md.display();
			md.print();
	}

}
