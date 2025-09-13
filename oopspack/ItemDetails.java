package oopspack;

import java.util.Scanner;

class Item{
	
	int itemId;
	String itemName;
	
	Item(int id, String name){
		itemId=id;
		itemName=name;
	}
	Item(){
		itemId=0;
		itemName=" ";
	}
	
	void details() {
		System.out.println("the item id is "+itemId+" and the item name is "+itemName);
	}
	
	
}   

public class ItemDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the item ID");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter iteam name");
		String name=sc.nextLine();
		
		Item obj1=new Item(id, name);
		
		Item obj2=new Item(450,"laptop");
		
		obj1.details();
		obj2.details();
	}

}
