package Week11_Sali;

public class Outer {
 private int serialNumber = 10;
 
	 class Inner{
		 int getValue(){
			  return serialNumber;
		 }
	 }
	 
	  void displaySerialNumber(){
		  
		  Inner ic = new Inner();
		  System.out.println("serialNumber : " + ic.getValue()   );
		  
		   
		  
	
	  }
	  
	  public static void main(String[] args) {
		
		  
		  Outer  oc = new Outer();
		   oc.displaySerialNumber();
		   
		   Outer.Inner oio = oc.new Inner();
		   
		   System.out.println("serialNumber : " + oio.getValue()   );
	}
}



