package Week9_;

interface InterfaceA{
	void message();
}

abstract class ClassB implements InterfaceA{
	 
}

// Public classes needs their own files
public class ClassA extends ClassB {

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassA a = new ClassA();
		
		a.message();
	}

	@Override
	public void message() {
		 
		System.out.println("Hello Home");
	}


}