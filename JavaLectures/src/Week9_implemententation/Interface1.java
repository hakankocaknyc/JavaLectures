package Week9_implemententation;

public interface Interface1 {
	  public void f1();
	  

}
interface  Interface2 extends Interface1{
	public void f2();
}
class A implements Interface2{

	@Override
	public void f1() {
		 System.out.println("Contents of Interface1");
		
	}
	public void f2() {
		 System.out.println("Contents of Interface2");
		
	}
	public void f3() {
		 System.out.println("Contents of Class A");
			
	}
	
}
