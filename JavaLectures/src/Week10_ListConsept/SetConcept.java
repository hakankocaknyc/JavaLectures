package Week10_ListConsept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		 // HashSet does not retain order
		// HashSet does not duplicate order
		
//		Set<String> set1 =  new HashSet<String>();

		//		Set<String > set1 = new LinkedHashSet<String>();// LinkedHashSet sirali veriyor
		
		 Set<String > set1 = new TreeSet<String>(); // Treeset alfabatik sirali veriyor
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		set1.add("mouse");
		
		System.out.println(set1);
	}

}
