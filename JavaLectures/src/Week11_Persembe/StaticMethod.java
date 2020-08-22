package Week11_Persembe;

 
// Static class and methods can only use static members of the class
public class StaticMethod {
	
	static int id = 1233;
	String name;

	static class staticClass{
		 void method1()
		{
			System.out.println("id " +  id);
//			System.out.println(name);
			
		}		
		
	}
	
	
	public static void main(String[] args) {
		 
		System.out.println(id);
	}
      void method(){
	System.out.println(id);
}
}
