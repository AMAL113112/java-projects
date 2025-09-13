package pratice;

abstract class Appliance{
	String brand;
	
	Appliance(String brand){
		this.brand=brand;
	}
	
	abstract void turnOn();
	
	void print() {
		System.out.println("Brand "+brand);
	}
	
}
class WashingMachine extends Appliance {
	 WashingMachine(String brand) {
		 super(brand);		 
	 }
	 @Override
	 void turnOn() {
	 System.out.println(brand+" has a heigh performance washing mech78nism");	 
	 }
}
class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Refrigerator is cooling...");
    }
}

public class AbstractConstructorDemo {

	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine("LG");
        wm.print();
        wm.turnOn();

        Refrigerator rf = new Refrigerator("Samsung");
        rf.print();
        rf.turnOn();

	}

}
