package oopspack;

import java.util.Scanner;

class AccoundNumber{
	int id;
	String name;
	
	public void set(int accountNo, String user) {
		
		id=accountNo;
		name=user;
	}
	public void print() {
		System.out.println(id+" "+name);
	}
	
}

public class AccountNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccoundNumber obj1=new AccoundNumber();
		AccoundNumber obj2=new AccoundNumber();
        
		
		obj1.set(119, "amal");
		obj2.set(100, "dev");
		
		System.out.println("Enter account number to search: ");
		int acc=sc.nextInt();
		
		if(acc==obj1.id) {
			obj1.print();
		}else if(acc==obj2.id) {
			obj2.print();
		}else {
			System.out.println("Account not found");
		}
        sc.close();
        
		
	}

}
