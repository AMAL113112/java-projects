package pratice;

import java.util.Scanner;

class jeep{
	String name;
    int year;
    
    jeep(String carName, int carYear ){
    	name=carName;
    	year=carYear;
    }
    jeep (){
    	name=" ";
    	year=0;
    }
    
    void displayInfo() {
    	System.out.println("car name is "+name+" and the manufactured year is "+year);
    }
    
}

public class Drive {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the car name");
	String carName=sc.nextLine();
	
	System.out.println("enter the model year");
	int carYear=sc.nextInt();
	
	jeep obj=new jeep(carName, carYear);
	jeep obj2=new jeep("bmw", 2019);
	
	obj.displayInfo();
	obj2.displayInfo();
	sc.close();
	}

}
