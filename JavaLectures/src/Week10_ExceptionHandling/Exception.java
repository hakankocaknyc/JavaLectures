package Week10_ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
	 
		System.out.println("hello World");
		
		// try block tan sonra 1 veya daha fazla catch block veya finally block
		
		try {
			int []arr ={1};
			System.out.println(arr[2]);
			System.out.println(9/0);
			System.out.println("hhsh");
		} 
			
			catch (java.lang.Exception e) {
				System.out.println("Catch blok calisiyor");
			 
			e.printStackTrace();
		}

		
	}

}
