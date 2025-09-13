package polymorphism;

class demo{
	int numOne;
	int numTwo;
	
	demo(int numOne, int numTwo){
		this.numOne=numOne;
		this.numTwo=numTwo;
	}
	public void sum() {
		System.out.println(numOne+numTwo);
	}
	public int sum(int first, int second, int third) {
		return first + second + third;
	}
	public float sum(float first, int second) {
		return first + second;
	}
	public double sum(double first, float second, int third) {
		return first + second + third;
	}
	public float sum(int first, int second, float third) {
		return first + second + third;
	}
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		demo de=new demo(34,54);
		
		de.sum();
		
    	System.out.println(de.sum(200,300,400));
		
		System.out.println(de.sum(34.5f,78));
		
		System.out.println(de.sum(567.8,45.6f,78));
		
		System.out.println(de.sum(78,34,5f));
	}

}
