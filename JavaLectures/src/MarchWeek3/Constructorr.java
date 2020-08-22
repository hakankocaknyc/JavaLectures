package MarchWeek3;

public class Constructorr {

	public static void main(String[] args) {
		ThirdClass object = new ThirdClass()  ;
		 SuperClass s = new SuperClass();
		 s.overridenMothod();
		 s.superClassMethod();
		 
		
	}
	
} 
class FirstClass{
	public FirstClass() {
		 System.out.println("First");
	}
}
class SecondClass extends FirstClass{
	public SecondClass() {
		System.out.println("second");
	}
}
class ThirdClass extends SecondClass{
	public ThirdClass() {
		System.out.println("Third");
	}
}