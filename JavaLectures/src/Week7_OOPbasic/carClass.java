package Week7_OOPbasic;



public class carClass {
	
	// Variables= properties==state
	
	String module;
	String color;
	int engineSize;
	String madeBy;
	
	
	// Attributes= behavior 
	public void accelerate(){
		System.out.println(" Car is accelerating");
	}
	
	public void stop(){
		System.out.println("Car is stooping...");
	}
	

	public static void main(String[] args) {
		
		
		// Create object
		
		carClass honda= new carClass();
		honda.module="Civic";
		honda.color ="red";
		honda.engineSize=2000;
		honda.madeBy="Japanese";
		System.out.println("Honda module is " + honda.module );
		System.out.println("Car color is " + honda.color);
		System.out.println("Car engineSize is " +honda.engineSize);
		System.out.println(" The Car madeBy is " +honda.madeBy);
		 
		
		honda.accelerate();
		honda.stop();
		
		
		
		
	}

}
