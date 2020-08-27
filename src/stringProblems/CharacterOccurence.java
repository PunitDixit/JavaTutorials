package stringProblems;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		
		String str = "Selenium";
		
		char [] ch =  str.toCharArray();
		
		
        HashMap<Character, Integer>hmap =  new HashMap<Character, Integer>();
        
        for (int i =0;i<ch.length;i++)
		
        {
        	
        	if(hmap.get(ch[i])!=null)
        	hmap.put(ch[i], hmap.get(ch[i])+1);
        	else
        		hmap.put(ch[i],1);
        	        	
        }
        
        for(Entry<Character, Integer> ele: hmap.entrySet()) {
        	//For displaying repeated characters only
        	if(ele.getValue()>1) {
        		System.out.println(ele.getKey()+"___"+ele.getValue());
        	}
        	
        	   }
        
        for(Character key: hmap.keySet()) {
        	
        	if(hmap.get(key)>1) {
        		System.out.println(key+"****"+hmap.get(key));
        	}
        	
        }
        
        
	}
	

}
