package pratice;

class Book{
	String title;
	String author;
	double price;
	
	Book(String TheTitle, String TheAuthor, double ThePrice){
		title=TheTitle;
		author=TheAuthor;
		price=ThePrice;
	}
	public void setDetails() {
		
	}
	void getDetails() {
		System.out.println("title: "+title+"author: "+author+"price: "+price);
	}
	
}

public class Library {

	public static void main(String[] args) {
		Book obj1 = new Book("Atomic Habits", "James Clear", 450.50);
        Book obj2 = new Book("Clean Code", "Robert C. Martin", 799.99);
		
		obj1.getDetails();
		System.out.println("-----------");
		obj2.getDetails();
	}

}
