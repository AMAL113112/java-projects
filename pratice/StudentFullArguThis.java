package pratice;

class Address{
	int houseNo;
	String lane;
	String city;
	String country;
	
	Address(int houseNo, String lane, String city, String country){
		this.houseNo=houseNo;
		this.lane=lane;
		this.city=city;
		this.country=country;
	}
}
class Child{
	int rollNo;
	String name;
	Address adrs;
	
	Child(int rollNo, String name,Address adrs){
		this.rollNo=rollNo;
		this.name=name;
		this.adrs=adrs;	
	} 
	void get() {
		System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Address Details:");
        System.out.println("House No: " + this.adrs.houseNo);
        System.out.println("Lane: " + this.adrs.lane);
        System.out.println("City: " + this.adrs.city);
        System.out.println("Country: " + this.adrs.country);
		
	}
}

public class StudentFullArguThis {

	public static void main(String[] args) {
		
		Address obj=new Address(56,"vbs","payyanur","india");
		
		Child obj2=new Child(32,"amal",obj);
		
		obj2.get();
		
	}

}
