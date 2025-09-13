package pratice;

interface football{
    public void print();
}

interface cricket{
	public void play();
}
class games implements football {
	public void print() {
		System.out.println("playing football");
	}
}
class indoor implements cricket{
	public void play() {
		System.out.println("playing cricket");
	}
}

public class GamesInterface {

	public static void main(String[] args) {
		football f=new games();
		f.print();
		
		cricket c=new indoor();
		c.play();
	}

}
