package pratice;

interface device{
	void turnOn();
	void turnOff();
}

abstract class system{
	String time1;
	String time2;
	
	system(String time1,String time2){
		this.time1=time1;
		this.time2=time2;
	}
	
	void print() {
		System.out.println("Device scheduled ON at " + time1 + " and OFF at " + time2);
	}
}
class fan extends system implements device{
	fan(String time1, String time2){
		super(time1, time2);
	}
	@Override
	public void turnOn() {
		if(time1.equals("10 AM")) {
			System.out.println("fan turns on at "+time1);
			
		}	
	}
	@Override
	public void turnOff() {
		if(time2.equals("11 PM")) {
			System.out.println("fan turns off at "+time2);
		}
	}
}
class light extends system implements device{
	light(String time1, String time2){
		super(time1, time2);
	}
	@Override
	public void turnOn() {
		if(time1.equals("10 AM")) {
			System.out.println("light turns on at "+time1);
			
		}	
	}
	@Override
	public void turnOff() {
		if(time2.equals("11 PM")) {
			System.out.println("light turns off at "+time2);
		}
	}
}
class SmartHub {
    String owner;

    SmartHub(String owner) {
        this.owner = owner;
    }

    void displayOwner() {
        System.out.println("SmartHub Owner: " + owner);
    }
}
public class SmartHomeSystemutil {

	public static void main(String[] args) {
		
		SmartHub hub=new SmartHub("Amal");
		hub.displayOwner();
		
		device s=new fan("10 AM","11 PM");
		device l=new light("10 AM","11 PM");
		
		System.out.println("\n--fan--");
		((fan)s).print();
		s.turnOn();
		s.turnOff();  
		
		System.out.println("\n--light--");
		((light)l).print();
		l.turnOn();
		l.turnOff();
	}

}
