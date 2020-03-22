package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer> ();
			
		System.out.println("ArrayList size: "+al.size());
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
	
		System.out.println(al.get(0));
		System.out.println(al.size());
		
		al.add(1, 99); //APPENDS
		System.out.println(al.get(1));
		
		//FIRST WAY OF ADDING TWO COLLECTIONS
		ArrayList <Integer> al2 = new ArrayList <Integer>(al);
		System.out.println(al2);
		al2.add(45);
		System.out.println(al2);
		
		//SECOND WAY OF ADDING COLLECTIONS
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(56);
		al3.addAll(al2);                                           //ADDALL ONLY FOR ADDING COLLECTIONS
		al3.add(65);
		System.out.println(al3);
		
		//ADDING COLLECTION AT SPECIFIC INDEX
		al3.addAll(2,al2);
		System.out.println(al3);
		
		//"REMOVE""ALL"" FOR REMOVING A COLLECTION "REMOVE" FOR REMOVING AN OBJECT
		System.out.println(al3.removeAll(al2)+"  "+al3);
		
		ListIterator<Integer> list  = al.listIterator();
	    System.out.println(list.next());
		System.out.println(list.next());		// OBSERVE THAT INDEX POSITION CHANGES
		System.out.println(list.nextIndex());
			
		
		//****IMPORTANT***** DIFFERENCE BETWEEN ADD AND SET IS THAT ADD APPENDS WHEREAS SET REPLACES
		System.out.println(al);
		al.set(0, 8);
		System.out.println(al);
		
		
		//WITH ARRAY THERE WILL ALWAYS BE INDEXING
	    System.out.println(al.lastIndexOf(99));
	    System.out.println(al.indexOf(99));
	    
	 
		
		
		
		
		}
		
		
		
		
		
		
	}


