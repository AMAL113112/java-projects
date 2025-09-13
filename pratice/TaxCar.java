package pratice;

class Bmw{
	String name;
	double price;
	
	Bmw(String name, double price){
		this.name=name;
		this.price=price;
	}
	void payment(double tax) {
		double total;
		total=price+tax;
		System.out.println("Total after tax: "+total);
		
	}
	public Bmw printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		return this;
	}
}

public class TaxCar {

	public static void main(String[] args) {
		Bmw obj=new Bmw("amal", 800000);
		
		Bmw obj2=new Bmw("hari", 800000);
		
		obj.printDetails().payment(50000);
		obj2.printDetails().payment(32060);

	}

}
