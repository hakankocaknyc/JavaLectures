package Week10_CarsambaGrup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Group1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		
			HashSet<String> hashSet = new HashSet();
				hashSet.add("Treeset");
				hashSet.add("HashSet");
				hashSet.add("ArrayList");
				hashSet.add("ArrayList");
				hashSet.add("LinkedList");
							
				System.out.println(hashSet);
				
				Iterator<String> iterator = hashSet.iterator();
				// Concatenate all the elements in a string
			
					String string = "";
				
				while (iterator.hasNext()) {
					string = string+iterator.next();
				}
				System.out.println(string);
				
				
				
				
			 HashSet hashSet3 = new HashSet<>();
			 hashSet3.add("jan");
			 hashSet3.add("can");
			 hashSet3.add("pan");
			 hashSet3.add("kkl");
			  System.out.println(hashSet3);
			 
			 Iterator<String> it  = hashSet.iterator();
				while (it .hasNext()) {
					System.out.println(it .next());
				
				
				
				
			
				
				
				
				HashSet<Integer> hashSet2 = new HashSet();
				hashSet2.add(5);
				hashSet2.add(6);
				hashSet2.add(7);
				hashSet2.add(8);
				hashSet2.add(3);
				
				System.out.println(hashSet2);
				 
		
				ArrayList<Integer> in = new ArrayList<Integer>();
				in.add(2 );
				in.add(1 );
				in.add(3);
				 int topla =0;
				 
				 for (int i = 0; i < in.size(); i++) {
					 topla = topla+ i;
				}
				 System.out.println("topla " + topla);
				
		 
				
				
				// find sum of all the numbers
				Iterator<Integer> iterator1 = hashSet2.iterator();
				int sum =0;
				while (iterator1.hasNext()) {
					sum += iterator1.next();
				}
				System.out.println(sum);
				
				
				int [] arr = {1,2,2,3,3,4,5,6};
				
				// convert to arrayList
				
				ArrayList<Integer> arrayList = new ArrayList<>();
				for (int i = 0; i < arr.length; i++) {
					arrayList.add(arr[i]);
				}
				for (int i = 0; i <arrayList.size(); i++) {
					System.out.println(arrayList.get(i));
				}
				
				// convert this arrayList into set
				Set<Integer> set = new HashSet<>();
				for (int i = 0; i < arrayList.size(); i++) {
					set.add(arrayList.get(i));// arr[i]
				}
				System.out.println(set);
				
				
	}

}}