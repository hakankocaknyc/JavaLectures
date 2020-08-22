package Week7_OOPFamily;

public class MyfailyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyFamily hakan= new MyFamily();
		
		hakan.mydaughter1Name ="Azra";
		hakan.mydaughter2Name = "Esra";
		hakan.mydaughter1Age= 9;
		hakan.mydaughter2Age =11;
		
		System.out.println( "my daughter1 name is : " + hakan.mydaughter1Name);
		System.out.println( "my daughter2 name is : " + hakan.mydaughter2Name);
		System.out.println("my daughter1 Age  is :   " + hakan.mydaughter1Age );
		System.out.println("mydaughter2 Age  is :   " + hakan.mydaughter2Age );
		System.out.println("<---------->--------<----->");
		hakan. azra();
		hakan.esra();
		
		
	}

}
