package searchDemo;

public class LinearSearch {

	
	/**
	 * In linear search the element to be searched is compared with each element in the array in sequential order
	 * 
	 */
	public static void main(String[] args) {

       int [] arr = {1,4,6,2,6,32,5};
       
       int srch = -70; //element to be searched in array
       
       
       boolean status=false; // useful only when the element is not found the the array.
       
       for (int i=0; i<=arr.length-1;i++)
       {
    	   if (arr[i]==srch) {
    		   
    		   System.out.println(srch+ " Element is found at index: "+i);
    		   status = true;
    		   break;
    	   }
       }
		
		if (!status)
			System.out.println("No such element found");
			
		
		
	}

}