package pratice;

class Mobile{
	String customerName;
	double amount;
	double discount;
	
	Mobile(String customerName){
		 this.customerName = customerName;  // assign parameter to instance variable
	}
    public void payment(double mobilePrice) {
		amount=mobilePrice;
		discount=(mobilePrice*20)/100;
		this.print();
	}
	
	public void print() {
        System.out.println("Customer: " + this.customerName);
        System.out.println("Amount: " + this.amount);
        System.out.println("Discount: " + this.discount);
        System.out.println("To Pay: " + (this.amount - this.discount));
	}
}

public class MobilePhone {

	public static void main(String[] args) {
		
		  Mobile customer1 = new Mobile("Amal");   // create object
	        customer1.payment(5000);                 // pass mobile price
	}

}
