package sortDemo;

public class BubbleSort {

	
	/**
	 * Compare adjacent elements and replace
	 * 
	 * O*O loop
	 * 
	 * */
	public static void main(String[] args) {
		
		int arr [ ]= {2,5,1,6,3,7,0,8};                    //Length = 8
		int temp=0;
		
		System.out.println("Array length "+arr.length);
		for (int i=0;i<arr.length-1;i++)                   //Length-1 outer loop
		{
			int flag = 0;
			for (int j=0;j<arr.length-1-i;j++)             // length-1-i inner loop, No need to sort already sorted element in previous cycle thats why minus i
			{
				
				if (arr[j]<arr[j+1]) // CHANGE THE OPERAND FOR INCREASING OR DECREASING ORDER
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag =1;
				}
				
				
			}
			if (flag==0)
				break;
		}
		
		for (int a :arr) {
			System.out.println(a);
		}
		
		
		
	}

}
