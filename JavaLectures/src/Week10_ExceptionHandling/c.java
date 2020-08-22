package Week10_ExceptionHandling;

import java.util.HashSet;
import java.util.Iterator;

public class c {
public static void main(String[] args) {
	
	HashSet<String>hashSet = new HashSet<>();
	hashSet.add("kjk");
	hashSet.add("ssd");
	hashSet.add("kjj");
	hashSet.add("ssdi");
	hashSet.add("ssdi");hashSet.add("ssdi");hashSet.add("ssdi");
//	System.err.println(hashSet);
	
	
	for (String s : hashSet) {
//		System.out.println  (s + "  ");
//		Iterator iterator = hashSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//	} 

		Iterator iterator =   hashSet. iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Iterator iterator2 = hashSet.iterator();
		Iterator iterator3 = hashSet.iterator();
		Iterator iterator4 = hashSet.iterator();
		Iterator iterator5 = hashSet.iterator();
		 while (iterator.hasNext()){
			 System.out.println(iterator2.next());
			 
			 while (iterator.hasNext());
			 System.out.println(iterator.next());
		 }
}
}}
