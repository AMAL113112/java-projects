package pratice;

class TheBook{
	String title;
	String author;
	double price;
	
	TheBook(String title, String author, double price){
		
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display() {  
		System.out.println("tile: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
	}
}

public class ThisDemoA {

	public static void main(String[] args) {
		TheBook obj=new TheBook("the fool of friendship","amal",9500.9);
		TheBook obj1=new TheBook("the one b", "mmal", 500.9);
		
		obj.display();
		System.out.println("========");
		obj1.display();
		
	}

}
