package sortDemo;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		int arr [] = {3,2,4,1};
		
		int n = arr.length;
		
		for (int i =1; i<n; i++)
		{
			
			int key =arr[i];
			
			for (int j=i-1 ; j>=0; j--)
			{
				
				if (key<arr[j])
				{
					arr[j+1]=arr[j];  //Shifting bigger element to right side by one index
					arr[j]=key;    // Simple swap technique using third variable
					
				}
				
				
			}
			
						
		}
		
		for (int a:arr)
		{
			System.out.println(a);
		}
		
		
		
		
	}

}
