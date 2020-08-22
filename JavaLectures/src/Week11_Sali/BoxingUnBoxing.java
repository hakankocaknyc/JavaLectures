package Week11_Sali;

import java.util.ArrayList;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		 // from primitive data type to object is : AutoBoxing // boxing
		// From object to primitive data type is  : Unboxing
		
		int a = 50;
		// Boxing
		Integer integer = a;
		System.out.println(integer);
		
		// Unboxing
		
		Integer integer2 = 100; 
		int b = integer2;
		System.out.println(b);
		
		Integer a1 = new Integer(a);
		int a2 =a1.intValue();
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);// Boxing
		
		int x = 100 ;
		arrayList.add(x); // Boxing
		
		int y = arrayList.get(0); // Unboxing
		
	}

}
