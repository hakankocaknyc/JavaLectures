package Week10_ExceptionHandling;

import java.util.HashSet;
import java.util.Iterator;

public class ex {

	public static void main(String[] args) {

		// 10 persons age
		//
		int[] ages = new int[5];
		// one step more useful then array-arraylist
		// When i need to create a list which is holding only unique element
		// -sets
		// if you want to create a program which has key- value relation- Map

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(66);
		hashSet.add(67);
		System.out.println(hashSet);
		// index number olmadigi icin iterator kullaniyoruz
		Iterator iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

			try {
				System.out.println(9 / 0);// Exception

				int[] arr = { 1 };
				System.out.println(arr[4]);// Exception
				System.out.println("Hello Silicone Labs");
				
			} catch (Exception e) {
				System.out.println("This is catch block");
			}

		}
		System.out.println("Hello World");
	}
}
