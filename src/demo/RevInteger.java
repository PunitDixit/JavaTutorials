package demo;

public class RevInteger {

	public static void main(String[] args) {

		
      int num = 12345678;
     int rev=0; 
         while (num!=0) {
        	 
        	 rev = rev*10+num%10;
        	 num=num/10;
        	 
         }
		System.out.println(rev); 
    	 num =1234;
		System.out.println((new StringBuffer(String.valueOf(num)).reverse()));
		
	}
	

	
	
	

}
