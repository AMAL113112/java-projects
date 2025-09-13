package pratice;

interface printer{
	void print();
}
class inkjetPrinter implements printer{
	public void print() {
		System.out.println("enter the color name");
	}
}
class laserPrinter implements printer{
	public void print() {
		System.out.println("choice the metrial");
	}
	
}

public class PrinterInterface {

	public static void main(String[] args) {
		printer p=new inkjetPrinter();
		p.print();
		
		printer p2=new laserPrinter();
		p2.print();
	}

}
