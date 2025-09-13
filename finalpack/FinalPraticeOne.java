package finalpack;

class BankAccount{
	public final void calculateInerest() {
		System.out.println("Interest calaulate at 5%");
	}
	public void displayDetails() {
		System.out.println("This is a bank account");
	}
    public void show() {
    	System.out.println("for vip user");
    }
	
}
class SavingsAccount extends BankAccount{
	@Override
	public void displayDetails() {
		System.out.println("This is a savings account");
	}
}
class SecondAccount extends SavingsAccount{
	@Override
	public void show() {
		System.out.println("this is a private account");
	}
}
public class FinalPraticeOne {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.calculateInerest();
		ba.displayDetails();
		
		SavingsAccount sa=new SavingsAccount();
		sa.calculateInerest();
		sa.displayDetails();
		
		SecondAccount saa=new SecondAccount();
		saa.calculateInerest();

	}

}
