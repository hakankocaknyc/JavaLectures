package Week9_implemententation;

  interface Person {
	  int a=10;
	  
	void msg();
	 

}
class Employee implements Person{
				int a=11;
	@Override
	public void msg() {
		 System.out.println("i am Person");
		
	}
	
	 
} 
  