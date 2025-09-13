package oopspack;

class Customer{
	//instance variable
	int custId;
	String custName;
	
	//Customer(){
		//custId=20;
		//custName="luminar";
	//}
		public void set(int id, String name) {
			custId=id;
			custName=name;
		}
	public void print() { 
		System.out.println(custId+" "+custName);
	}
}
public class CustomerDetails {

	public static void main(String[] args) {
		   
		Customer obj1=new Customer();
		
		// System.out.println(customer.custId+" "+customer.custName);
		Customer obj2=new Customer();
		
		obj1.set(20,"luminar");
		obj2.set(40, "kochi");
		obj1.print();
		obj2.print();

	}

}
