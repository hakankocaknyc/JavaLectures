package Week8_base;

 abstract public class Base1 {
	int a =5;
	
	 abstract void get(int a, int b);
	 
	 abstract void add();
	 
	 abstract void display();
	 void sum(){
		 System.out.println("abstract olmayan metot");
	 }
	 
}
 class SubClass1 extends Base1{
	  int x=6;
	  int y= 7;
	  int z= 9;
	  int a=12;
	  
//	@Override
//	void get(int a, int b) {
//		
//	   
//		x= a;
//	    y = b;
//	  
//	  
//		
//	}
	@Override
	void add() {
		 z= x+y;
		 
		
	}
	@Override
	void display() {
		 System.out.println("The addition is  " + z); 
		
	}
//	 
//	void sum(){
//		 System.out.println("SubClass1 abstract olmayan metot");
//	 }
	@Override
	void get(int a, int b) {
		// TODO Auto-generated method stub
		
	}	
 }
