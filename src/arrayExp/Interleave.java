package arrayExp;

public class Interleave {

	public static void main(String[] args) {


		int [] A1 = {6, 11, 5, 21,43}; // initializing 1st array 
		int [] A2 = {64, 26, 72, 8, 35}; // initializing 2nd array

		int s1 = A1.length; 
		int s2 = A2.length;
		int s3 = s1+s2;  // Calculating length for the third array A3 


		int [] A3 = new int[s3]; // Initializing third array with s3 which is sum of length of A1 and A2

		int i=0, j=0, k=0; 

		//while loop to create interleave array , will even manage when both A1 and A2 lengths are not equal
		while(i < s1 || j<s2) {
           			
			if(i<s1) 
			A3[k++]=A1[i++];
			
			if(j<s2)
			A3[k++]=A2[j++];
			
		}

		// for each loop to dispaly A3
		for (int element : A3) {
			System.out.println(element);
		}



	}

}
