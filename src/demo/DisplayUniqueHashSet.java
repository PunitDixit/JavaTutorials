package demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DisplayUniqueHashSet {

	public static void main(String[] args) {
		
		int [] a = {10,10,23,10,42};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0;i<a.length;i++)
		{
			if(set.add(a[i])==false) { // Ye method false return karta hai in case of duplicate value
				System.out.println(a[i]+" Not added as already exits"); 
			};
		}
		
		System.out.println(" Actual Output************");
		
		for(Integer temp: set)
		{
			
		
			System.out.println(temp); //yahan par main 'a' daal de raha tha 
			                           //isliye us time output nahi aya tha
		}
		
		
		// For Sorting HashSet using TreeSet
		
		TreeSet<Integer> ts = new TreeSet<Integer>(set);
		
		for(int n: ts.descendingSet()) {
			System.out.println(n);
		}
		
		
		
	}

}
