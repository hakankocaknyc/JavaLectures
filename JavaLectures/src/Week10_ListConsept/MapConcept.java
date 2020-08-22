package Week10_ListConsept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

 
 
 

public class MapConcept {
 
		public static void main(String[] args) {
			
			
			
		Map<Integer, String> hasMap = new HashMap<Integer, String>();
		
		Map<Integer, String> linkedHasMap = new LinkedHashMap<Integer, String>();
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		
		testMap(treeMap);

		
	}

		public static void testMap(Map<Integer, String> map){
			
			map.put(1, "fox");
			map.put(3, "cat");
			map.put(4, "dog");
			map.put(0, "beer");
			map.put(6, "Snake");
			for (Integer key :map.keySet() ) {
				String value = map.get(key);
				
				System.out.println(key + " : " + value);
			}
		}
}
