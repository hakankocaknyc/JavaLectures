package MarchWeek2_0;

public class Declare {
 // i would like to find how many object has been create from this class
	 static int counter;
	public Declare (){
		
		counter++;
	} 
	
	
	public static void main(String[] args) {
	 
// declaring objects in different ways
		
		// Declaring object reference 
		Declare object1 = new Declare ();
		 // Anonymous Objects , this is a good approach when we need to object one time
		new Declare();
		new Declare().method();
		
		
		// Creating multiple object in one statement
		Declare object2 = new Declare(), object3 = new Declare(),	
			  object4= new Declare(),  object5= new Declare();
		
		System.out.println(counter);
	}
void method(){
	
	System.out.println("Method");
}
}
