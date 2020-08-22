package Week10_PersException;

 

		public class ExcepExapl3 {
		
			static void method()  throws Exception{ // burda throws yazarak method icinde bir hatanin 
				// olabilecegini haber veriyoruz 
				
				System.out.println(9/0);// bu islemin hatali oldugunu dusunmustun simdi bunu coz diyor
		
//				throw new ArithmeticException();
			}
		
			public static void main(String[] args) {
				// throw , is used to create an exception
		
				// throws
	         try {
	        	 method();// burada bunu try catch yapiyoruz metod calismaya devam ediyor
			} catch ( Exception e) {
				 System.out.println("ArithmeticException :" + e);
			}
				
}
}
