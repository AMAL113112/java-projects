package oopspack;

class participance{
	int rollNo;
	String name;
	static String school = "pilicode";

    participance(int num, String Name){
    rollNo=num;
    name=Name;
    }
    
    
    void display(){
    	
    	int i=1;
    	
    	System.out.println(rollNo+" "+name+" "+school+" "+i);
    	
    }
    public static void print() {
    	System.out.print("for each");
    }
}

public class TypeOfVariable {

	public static void main(String[] args) {
		System.out.println(participance.school);
		
		participance.school ="Luminar";
		
		participance obj1 = new participance(32, "Amal");
		
		//System.out.println(obj1.rollNo);
		//System.out.println(obj1.name);
        
        obj1.display();
        participance.print();
       
      
	}

}
