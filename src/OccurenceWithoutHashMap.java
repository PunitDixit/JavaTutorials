
public class OccurenceWithoutHashMap {

	public static void main(String[] args) {
		
		String str = "Hello ji Hello ji Hello ji Hello ji Punit What the hell ji not Hello";
		String[]arr;
		arr = split(str);
				
		int count=0, l1=0;
		int length=arr.length;
		String word="";
		int i,k=0;
		
		for (i=0 ; i<length ; i++)
		{   l1=length; //WHEN ARRAY IS CUT SHORT BY REMOVING PREVIOUSLY SEARCHED ELEMENT
			for (k=i+1 ;k<length;k++)
			{
				if(arr[i].equals(arr[k])) {
					++count;
				}
				if(k==i+1) {
			     word = arr[i];
				}
				
									}
			
			arr = replace(arr, arr[i] ); //REMOVES THE SEARCHED ELEMENT AND RETURNS A NEW ARRAY
			length=arr.length; // RE-ASSIGNS THE LENGTH FOR RECONFIGURING THE FOR LOOP FOR THE NEW ARRAY
			
			if (count>1) {
			System.out.println("Word "+word+" occured "+(count+1)+" times."); // PRINTS THE WORD AND ITS OCCURENCES, +1 IS ADDED TO COUNT SO AS TO INCLUDE THE WORD THAT IS BEING SEARCHED
			}
			
				if(l1>length){ //RESETS THE COUNTER AND INDEX FOR RECONFIGURING NEW FOR LOOP FOR NEW ARRAY
					i=-1;
				    count=0; 
				}
			
		}
		
		}

	
	/**split method   */
	static String[] split(String str) {
		
		String [] arr = str.split(" ");
		return arr;
	}
	
	/**remove method   */
	static String [] replace(String [] arr, String str) {
		String strNew="";
		String [] arrNew =null;
		     for(int i=0; i<arr.length;i++) {
		    	 
		    	 if(arr[i].equals(str)) {
		    		 arr[i]=arr[i].replaceAll(str, ""); //DONT FORGET TO ASSIGN UPDATED VALUE TO ARR[I]
		    	 }
		    	 if(!arr[i].equals("")) {
		    	 strNew=strNew+arr[i]+" ";
		    	 }
		    	 
		     }    
		    
		     strNew = strNew.trim();
		    arrNew= split(strNew);
		return arrNew;
		
	}
	

}
