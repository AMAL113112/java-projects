package college.staff;

import college.civil.staff.Teacher;

//import college.cse.staff.Teacher;
 
public class Test {

	public static void main(String[] args) {
		Teacher civilteacher=new Teacher(23,"amal");
		civilteacher.teachCivil();
		
		college.cse.staff.Teacher cseTeacher=new college.cse.staff.Teacher(2,"abhi"); 
		cseTeacher.teachCse();
	}

}
 