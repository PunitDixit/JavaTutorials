package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> hmap = new HashMap<String, String>();
		
		System.out.println("HashMap: It implements Map interface, holds key value pair, cannot have duplicate keys");
		
		hmap.clear(); //clears the hash map
		
		hmap.put("Punit", "1");
		hmap.put("Amit", "2");
		hmap.put("Sumit", "3");
		hmap.put("Punit", "4");	//Updates the value
		System.out.println(hmap.get("Punit"));
		
		
		System.out.println("KeySet() acts as an iterator to display all values at once");
		
		Set<String> keys = hmap.keySet();
 
		for( String val : keys) {
			
			System.out.println(val+" : "+hmap.get(val));
		}
		
		Set<Map.Entry<String, String>>values = hmap.entrySet();
		
		for(Map.Entry<String, String> val: values)
		{
			
		}
		
		
		
		
		
	}

}
