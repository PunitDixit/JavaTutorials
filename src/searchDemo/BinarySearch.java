package searchDemo;

public class BinarySearch {

	
	/**
	 * Pre-Condition: Binary search works only when the elements are sorted
	 * 
	 * Step1: Find Li (lower index) and hi
	 * Step2:  
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		 int [] arr = {1,2,3,4,5,6,7,8,9};
	       
	       int srch = 9; //element to be searched in array
	       
	       //Step1
	       int li =0;
	       int hi= arr.length-1;
	       int mi=0;
	       boolean status = false;
	      
	       while(li<=hi) {  //THIS CONDITION IS VERY IMPORTANT LOWER INDEX SHOULD BE LESS OR EQUAL TO HIGHER INDEX
	    	   
	    	   
		       mi = (li+hi)/2;
		       
	    	   
	    	   if (srch==arr[mi]) {
	    		   System.out.println(srch+ " Element is found at :" +mi);
	    		   status =true;
	    		   break;
	    	   }
	    	   else if (srch>arr[mi]) {
	    		   li=mi+1; // SHIFT LOWER INDEX AFTER MIDDLE INDEX
	    	   }
	    	   else
	    		   hi=mi-1; // SHIFT HIGHER INDEX ONE LESS THAN MIDDLE INDEX
	    	   
	       }
	       	      
	       if (!status)
	    	   System.out.println("Element not found");
	       
		
		
	}

}
