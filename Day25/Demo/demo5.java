package Day25.Demo;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 5. LinkedHashMap
Definition: A LinkedHashMap is a hash table and linked list implementation 
of the Map interface.

Properties:

Maintains insertion order.
Allows null values and keys.
Not synchronized. 
 */
public class demo5 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
  		System.out.println(map);
		
		System.out.println("Size of Map : "+ map.size());
		
		System.out.println("Get Value : "+ map.get("One"));
		
		System.out.println("Check value : " + map.containsKey("Five"));
		
		System.out.println("Check Key : "+ map.containsValue(4));
		
		System.out.println("Remove Value : "+ map.remove("Four"));
		
		//Iterate through the map
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(
					"\nKey : "+ entry.getKey()
					+ "\nValue : "+ entry.getValue()
					);
		}
		map.clear();
		System.out.println(map);

	}

}
