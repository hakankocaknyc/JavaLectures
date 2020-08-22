package MarchWeek3;

public class Reference {

	public static void main(String[] args) {
		SuperClass object1 = new SubClass();
		// This object can access super class fields and methods but overridden methods in Subclass
		 object1.overridenMothod();
		 object1.superClassField =10 ;
		 object1.superClassMethod();
		
		 SuperClass object2 = new SuperClass();
		 object2.overridenMothod();
		 
	}

}
class SuperClass{
	
	int superClassField;
	void superClassMethod(){
		System.out.println("superClass Method");
	}
	  void overridenMothod( ){
		  System.out.println("Hello from super Class ");
	  }
}
class SubClass extends SuperClass{
	  void overridenMothod(){
		  System.out.println("Hello from sub Class ");
	  }
	  
	  void subClassMethod(){
		  System.out.println("subClass Method");
	  }
}