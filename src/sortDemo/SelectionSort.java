package sortDemo;

public class SelectionSort {
    /**
     * Divide array in two parts a[0] and arr[rest ellements]
     * 
     * In rest array find the index that contains smallest element and then swap it with arr[0]
     * 
     * */
	public static void main(String[] args) {
		
		int min;
		int temp=0;
		
		int arr [ ]= {2,1,5,3,6,4};
		
		for(int i =0; i<arr.length-1;i++)
		{
			min=i;
		
			
			for(int j=i+1; j<arr.length;j++)
			{
				
				if(arr[j]<arr[min])
				{
					min =j;
					
				}
				
			}
		
			if(min!=i) {
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;}
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

}
