package pratice;

interface Cameras{
	void takePhoto();
}
interface MusicPlayers{
	void playMusic();   
} 
class smartPhones implements Cameras, MusicPlayers{
	public void takePhoto() {
		System.out.println("Taking a photo with SmartPhone");
	}
	public void playMusic() {
		System.out.println("Playing music on SmartPhone");
	}
}
public class PhoneInterface {

	public static void main(String[] args) {
		Cameras s=new smartPhones();
		s.takePhoto();
		
		MusicPlayers m=new smartPhones();
		m.playMusic();

	}

}
