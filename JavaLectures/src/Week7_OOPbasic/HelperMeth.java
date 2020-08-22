package Week7_OOPbasic;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HelperMeth {
	
	public String getName(){
		
		return "John";
		
		
	}

	
	public int getAge(){
		
		return 20;
		
		
	}

public double getGPA(){
	
	return 3.75;
}

private String fatherJob(){
	
	return " His father is a president";
}
// Helper method 
public String information(){
	return "Name : " + this. getName() +
			"\nAge:" + this .getAge() +
			"\nGPA : " + this .getGPA() +
			"\nFather Job :" + this. fatherJob(); // 
	 
	 
 }
}

