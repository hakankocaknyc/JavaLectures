package Week10_ListConsept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConsept {

	public static void main(String[] args) {
		
//		List<String> values = new ArrayList<String>();// ordered index sirasiyla yazdiriyor
		
//		List<String> values = new LinkedList<String>();
		
		List<String> values = new Vector<String>();
		
		values.add("John");
		values.add("Smith");
		values.add("can");
		values.add("Hakan");
		values.add("Hakan");
		
		for (String value : values) {
			System.out.println(value);
			
		}

	}

}
