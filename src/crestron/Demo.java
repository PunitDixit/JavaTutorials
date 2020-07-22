package crestron;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String [] args) {
	
	String str = "elenium";
	
	char [] ch = str.toCharArray();
	
	HashMap<Character, Integer> hmap =  new HashMap<Character, Integer>();
	
	for (Character c: ch) {
		
		if (hmap.get(c)!=null)
		hmap.put(c, hmap.get(c)+1);
		else
			hmap.put(c, 1);
		
	}
	

	Set<Character > set = hmap.keySet();
	
	for(Character c: set)
	{
		if(hmap.get(c)<2) {
			System.out.println(c);
			break;
		}
		
	}
	
	
	
	}
	
	
	private void display(){
		
	}
		
	
}

