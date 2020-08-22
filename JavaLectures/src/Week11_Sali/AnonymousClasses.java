package Week11_Sali;

interface A{
	void print(String string);
}
public class AnonymousClasses  implements A{
	

	public static void main(String[] args) {
		
		A a = new A() {
			
			@Override
			
			public void print(String string) {
		System.out.println(string);
				
			}
		};
		a.print("hakan");
		  
	}
	
	
	@Override
	public void print(String string) {
		 System.out.println(string);
		
	}

}
