import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		
		int [] arr = new int [5];
		
		arr[0]=0;
		arr[1]=1;
		
		
			
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number to insert in array");
		
		int num = 7;
		
		System.out.println("Enter index");
		
		int index =  3;
		
		
		if (arr[arr.length-1]==0) {
			
			for (int i = arr.length-1;i>=index;i--)
			{
				if(i==index) {
					arr[index]=num;
				}else 
				arr[i]= arr[i-1];
				
			}
			
		}
		
		for(int n: arr)
		{
			System.out.println(n);
		}
		
	}

}
