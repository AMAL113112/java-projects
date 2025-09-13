package pratice;

class scoty{
	String name;
	double amount;
	double discount; 
	 
	scoty(String name){
		this.name=name;
	}
	public void payment(double amount) {
		this.amount=amount;
		discount=(amount*20)/100;
		this.print();
	}
	void print() {
		System.out.println("Customer Name: "+this.name);
		System.out.println("Amount: "+this.amount);
		System.out.println("Discount: "+this.discount);
		System.out.println("To pay: "+(this.amount-this.discount));
	}
}

public class ThisDiscount {

	public static void main(String[] args) {
		scoty obj=new scoty("amal");
		
		obj.payment(10000);
	}

}
