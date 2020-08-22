package Week10_Sali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
	
  ArrayList<String>arrayList = new ArrayList<>();	
  
   arrayList.add("Java");
   arrayList.add("Soap");
   arrayList.add("Rest");
   arrayList.add("Cucumber");
   System.out.println(arrayList);
   
//   System.out.println(arrayList.contains("Java"));
  
   // Iterator
 Iterator iteratore =arrayList.iterator();
// System.out.println(iteratore.hasNext());
 
 while (iteratore.hasNext()){
	 
	 System.out.println(iteratore.next());
 }
 // for loop
 for (int i = 0; i < arrayList.size(); i++) {
//	 System.out.println(arrayList.get(i));
	 
	 if (iteratore.hasNext()){
		 System.out.println(iteratore.next());
	 }
}
	}

}
