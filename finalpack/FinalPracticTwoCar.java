package finalpack;

class vehicle{
	public final void start() {
		System.out.println("Vehicle started");
	}
	public void displayType() {
		System.out.println("This is a vehicle");
	}
}
class Car extends vehicle{
	Car(){}
		public void speed() {
			System.out.println("Car speed is 100 km/h");		
	}
		@Override
		public void displayType() {
			System.out.println("This is a car");
		}
}
public class FinalPracticTwoCar {

	public static void main(String[] args) {
		vehicle ve=new vehicle();
		ve.start();
		ve.displayType();
		
		Car cr=new Car();
		cr.start();
		cr.displayType();
		cr.speed();

	}

}
