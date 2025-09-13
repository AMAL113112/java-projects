package pratice;

import java.util.Scanner;

class TheBank{
	int accountNumber;
	String holderName;
	double balance;
	
	 TheBank(int number, String name, double Balance){
		accountNumber=number;
		holderName=name;
		balance=Balance;
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Withdrawal successful");
			System.out.println("Remaining balance: "+balance);
		}else {
			System.out.println("insufficient balance");
			System.out.println("Balance: "+balance);
		}
	}
	
    void setprint() {
    System.out.println("Account no: "+accountNumber);
	System.out.println("Name: "+holderName);
    System.out.println("Amount: "+balance);	
    }
}

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TheBank obj=new TheBank(4567,"amal",100000.98);
		
		//obj.setprint();
		
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble(); 
		
		obj.withdraw(amount);
		sc.close();
	}

}
