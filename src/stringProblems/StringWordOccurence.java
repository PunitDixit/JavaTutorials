package stringProblems;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class StringWordOccurence {

	public static void main(String[] args) {
		
		//Repeat occurrence - display repeated words and their count
		
				String [] str = {"Hello", "Hello", "we"};
				
				HashMap<String, Integer>hmap =  new HashMap<String, Integer>();
				
				
				for(int i=0; i<str.length;i++) {
					
				if(hmap.get(str[i])!=null)
				hmap.put(str[i], hmap.get(str[i])+1);
				
				else
					
					hmap.put(str[i],1);
				}
				
				
			System.out.println(hmap.size());
			

			
			Set<Entry<String, Integer>> set= hmap.entrySet();
			
			for(Entry<String, Integer> s: set) {
				
				if(s.getValue()>1)
					System.out.println(s.getKey()+"  "+s.getValue());
			}
			
			
			
			
			
			Set<String> set1 = hmap.keySet();
			
			for (String s: set1) {
				
			 hmap.get(s);
			}

		
		
	}

}
