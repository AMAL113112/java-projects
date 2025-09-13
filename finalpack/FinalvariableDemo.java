package finalpack;

class  test{
	//final int num=100;
	final int num;
	
	test(int num){
		this.num=num;
	}
	public void show(){
		//num=200;
		System.out.println(num);
	}
	public void print() {
		final int temp=10;
		System.out.println(temp);
	}
	public void display(final int no) {
		System.out.println(no);
	}
}

public class FinalvariableDemo {

	public static void main(String[] args) {
		
		test ts=new test(100);
		ts.show();
		
		ts.print();
		
		ts.display(200);
		

	}

}
