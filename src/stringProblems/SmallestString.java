package stringProblems;
import java.util.Arrays;
import java.util.Collections;

public class SmallestString {

	public static void main(String[] args) {
		
		//Using CompareTo lexiographically unicode
		
		String str = "ma am love Java and Java";
		String []arr = str.split(" ");
		String smallStr = arr[0];
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i].compareTo(smallStr)<=0) {
				smallStr=arr[i];
			}
			
			
		}
		
		System.out.println(smallStr);
		
		System.out.println("************");
		
		//Using Collections sort which updates array automatically
		
		Collections.sort(Arrays.asList(arr));
		
		for(String a  :arr) {
			System.out.println(a);
		}
		
		
		//Using length method
		
		System.out.println("*****************f");
		smallStr = arr[0];
		
		for (int i=1; i<arr.length;i++) {
			
			if(smallStr.length()>arr[i].length())
			{
				smallStr=arr[i];
			}
			
			}
		System.out.println(smallStr);
			
		}
		
		
		
		
		
		
		
	
	
	
	
	

}
