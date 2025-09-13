package pratice;

abstract class medias{
	String music;
	String video;
	String radio;
	
	medias(String music, String video, String radio){
		this.music=music;
		this.video=video;
		this.radio=radio;
	}
	void print() {
		if (!music.isBlank()) System.out.println("Music: " + music);
        if (!video.isBlank()) System.out.println("Video: " + video);
        if (!radio.isBlank()) System.out.println("Radio: " + radio);
	}
}
interface Systems{
	void on();
	void off();
}
class tec extends medias implements Systems{
	tec(String music, String video, String radio){
		super(music, video, radio);
	}
	tec(String music, String video){
		super(music, video," ");
	}
	
	tec(String radio){
		super(" "," ",radio);
	}
	
	
	@Override
	public void on() {
		System.out.println("system is on");
	}
	@Override
	public void off() {
		System.out.println("system is off");
	}
}
class SmartTv extends tec implements Systems{
	SmartTv(String music, String video){
		super(music, video);
	}
	@Override
	public void on(){
		System.out.println("tv opens at 10 AM ");
		System.out.println("tv is playing "+video+" and "+music);
	}
	@Override
	public void off() {
		System.out.println("tv is shutdownat 11 PM");
	}
}
class radios extends tec implements Systems{
	radios(String radio){
		super(radio);
	}
	@Override
	public void on(){
		System.out.println("radio is playing "+radio);
	}
	@Override
	public void off() {
		System.out.println("radio is off ");
	}	
}
class lamp implements Systems{
	public void on() {
		System.out.println("lamp is On ");
	}
	public void off() {
		System.out.println("lamp is off");
	}
	class SmartHub {
	    String owner;
	}    
}
class SmartHub1{
	String owner;
	
	SmartHub1(String owner){
		this.owner=owner;
	}
    void displayOwner() {
        System.out.println("SmartHub Owner: " + owner);
    }
}

public class HomeEntertainmentSystemlti {

	public static void main(String[] args) {
		SmartHub1 hub=new SmartHub1("amal");
		hub.displayOwner();
		
		Systems md=new SmartTv("pogo","mtv");
		Systems md2=new radios("mangoR");
		Systems sd=new lamp();
		
		((SmartTv)md).print();
		md.on();
		md.off();
		
		((radios)md2).print();
		md2.on();
		md2.off();
		
		sd.on();
		sd.off();

	}

}
