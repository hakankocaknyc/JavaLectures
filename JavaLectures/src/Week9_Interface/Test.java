package Week9_Interface;

public class Test {
	 public static void main(String[] args) {
		
		// IDatabase iDatabase = new IDatabase(); inteface classtan 
		 // obje olusturulmaz.
		 
		 IDatabase database = new customer();
		IDatabase database2 = new Student();
		 
		 database.log();
		 database2.log();
	}
 

}
