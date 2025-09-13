package superPack;

class parent{
	parent(){// <--- Constructor with NO parameters (default constructor)
		System.out.println("parent");
	}
}
class child extends parent{
	child(){// <--- Constructor with NO parameters (default constructor)
		super();// Calls parent() constructor
		System.out.println("in child class constractor");
		//super(); wrong way to write
	}
	void show() {
		
	}
		
}
public class SuperClassConstractor {

	public static void main(String[] args) {
		child ch=new child();
		ch.show();

	}

}
