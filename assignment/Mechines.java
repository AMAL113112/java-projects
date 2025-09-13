package assignment;

abstract class vehicle{
	String brand;
	String model;
	int year;
	
	vehicle(String brand, String model, int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	abstract void print();
	
	void show(){
		System.out.println("brand "+brand+" model "+model+" year "+year);
	}
}
class carr extends vehicle{
	carr(String brand, String model, int year){
		super(brand, model, year);	
	}
	@Override
	void print() {
		System.out.println(brand+model+year+" car has 5 gears");
	}
}
class bikee extends vehicle{
	bikee(String brand, String model, int year){
		super(brand, model, year);	
	}
	@Override
	void print() {
		System.out.println(brand+model+year+"bike has 4 gears");
	}
}
public class Mechines {

	public static void main(String[] args) {
		carr cr=new carr("bmw","g series ",2024);
		bikee bk=new bikee("r15","m series ",2022);
		cr.show();
		cr.print();
		System.out.println("==============");
		bk.show();
		bk.print();
	}

}
