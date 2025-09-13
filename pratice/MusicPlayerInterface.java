package pratice;

interface Playable{
	public void play(String songName);
}

interface VoulumeControl {
	public void setVolume(int level);
}

class Spotify implements Playable, VoulumeControl{
	public void play(String songName) {
		System.out.println("Playing song: "+songName);
	}
	public void setVolume(int level) {
		System.out.println("volume set to: "+level);
	}
	
}
//Step 3: Second class implementing interfaces
//class AppleMusic implements Playable, VoulumeControl {
//   public void play(String songName) {
//     System.out.println("Apple Music playing: " + songName);
//   }
//   public void setVolume(int level) {
//     System.out.println("Apple Music volume set to: " + level);
//   }
    	
//} 
public class MusicPlayerInterface {

	public static void main(String[] args) {
		Spotify s=new Spotify();
		s.play("shap of you");
        s.setVolume(8);
        
//        AppleMusic a = new AppleMusic();
//        a.play("Blinding Lights");
//        a.setVolume(10);
	}

}
