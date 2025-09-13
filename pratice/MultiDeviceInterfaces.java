package pratice;

interface camera{
	void  takePhoto();
}
interface musicPlayer{
	void playMusic();
}
interface GPS{
	void navigate();
}

class SmartPhone implements camera, musicPlayer, GPS{
	public void takePhoto(){
		System.out.println("Taking photo in phone");
	}
	public void playMusic() {    
		System.out.println("Playing music in phone");
	}
	public void navigate() {
		System.out.println("using GPS in phone");
	}
}
class tablet implements musicPlayer, GPS{
	public void playMusic() {
		System.out.println("playing music in tablet");
	}
	public void navigate(){
		System.out.println("using GPS in tablet");
	}
}

public class MultiDeviceInterfaces {

	public static void main(String[] args) {
		camera c=new SmartPhone();
		c.takePhoto();
		
		musicPlayer m=new SmartPhone();
		m.playMusic();
		
		GPS g=new SmartPhone();
		g.navigate();
		
		//=====================================

		musicPlayer c2=new tablet();
		c2.playMusic();
		
		GPS g2=new tablet();
		g2.navigate();
	}

}
