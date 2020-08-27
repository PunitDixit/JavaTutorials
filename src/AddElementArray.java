
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddElementArray {

	public static void main(String[] args) throws IOException {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the element to be added: ");
		int num = reader.nextInt();
		System.out.println(num);
		
		System.out.println("Enter the index: ");
		int index = reader.nextInt();
		
		int arr [] = {0,1,3,4,5};
		
		
		int len = arr.length;
		
		
		if (index>len-1)
		{
			System.out.println("Enter a valid index under: "+(len-1));
			 index = reader.nextInt();
		}
		
		System.out.println("Index : "+index);
		
		
		//1st METHOD : CREATE A NEW ARRAY WITH ONE LENGTH MORE THAN THE OLD ARRAY AND ADD NEW ELEMENT TO IT
		
		int arrNew [ ] = new int [len+1];
		
		for (int i=0 ; i <index; i++)
		{
			arrNew[i]=arr[i];
		}
		
		for (int i=index+1;i<arrNew.length;i++)
		{
			
			arrNew[i]=arr[i-1];
		}
		arrNew[index]= num;
		
		
		for(int a: arrNew)
		{
			System.out.print(a);
		}
		
		
		
		// 2ND METHOD : USING ARRAYLIST FOR DYNAMICALLY INCREASING THE SIZE OF ARRAY
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int a: arr)
		{
			list1.add(a);
		}
		
		list1.add(2, 2);
		
		System.out.println(list1);

		Object[] arrNew1 = list1.toArray();
		    
	    
	

	
		
	}

}
