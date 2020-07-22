package test;

import java.util.HashSet;
import java.util.Set;

public class Display_Unique {

	public static void main(String[] args) {

		int [] arr = {1,2,3,3,2};


		Set<Integer> set= new HashSet<Integer>();


		for(int i =0; i<arr.length;i++)
		{		set.add(arr[i]);
		}

		for(int ele: set) {
			System.out.println(ele);
		}

	}

}
