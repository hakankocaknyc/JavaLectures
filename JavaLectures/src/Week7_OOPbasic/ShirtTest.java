package Week7_OOPbasic;

public class ShirtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Shirt s  = new Shirt();
		s.putOn();
		Shirt s1= new Shirt("blue", 'M');
		
		s.setColor("Blue");
		s.setSize('M');
//		System.out.println("shirt color is: " + s.getColor());
//		System.out.println("shirt size  is: " + s.getSize() );
	}

}
