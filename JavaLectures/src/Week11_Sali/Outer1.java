package Week11_Sali;

public class Outer1 {

	 private int data = 30;
	 void display(){
		 
		 class Local{
			 void msg(){
				 System.out.println(" Value is :  " + data);
				 
			 }
			 
			 Local local1 = new Local();
			 
		 }
	 }
	 
	 public static void main(String[] args) {
		 Outer1 outer1 = new Outer1();
//		  outer1.msg();
		
	}
	 

}
