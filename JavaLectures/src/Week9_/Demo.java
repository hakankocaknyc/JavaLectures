package Week9_;



interface HasBody{
	
	default void first(){
		System.out.println("This is the first default method");
	}
	default void srcond(){
		System.out.println("This is the seconddefault method");
	}
	
	default void third(){
//		System.out.println("This is the first default method");
	}
}
 public class Demo  implements HasBody{
	 public void first(){
		 System.out.println("This is the first  implementation default method");
		 
	 }
	 public void second(){// overriden 
		 System.out.println("This is the second  implementation default method");
		 
	 }
	 public void third(){// implemented
		 System.out.println("This is the third  implementation default method");
		 
	 }

	public static void main(String[] args) {
		  Demo demo = new Demo();
		  demo.first();
		  demo.second();
		  demo.third();
		 
		
	}

}
