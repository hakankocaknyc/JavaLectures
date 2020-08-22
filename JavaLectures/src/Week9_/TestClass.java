package Week9_;


interface TestInterface{
	
	public void square(int a);
	
	static void show(){
		System.out.println("Static Method");
	}
}
public class TestClass implements TestInterface{

	public static void main(String[] args) {
		
		TestInterface.show();
		
	}

	@Override
	public void square(int a) {
		
		System.out.println("Square method");
		 
		
	}

}
