package demo;

public class PatternDemo {

	public static void main(String[] args) 
	{
	
		int i,j,k,l,m;
		
		for(i=0 ; i<=4 ; i++)
		{
			for(k=4;k>=i;k--) {
				System.out.print(" ");  /// VERY IMPORTANT DONT USE PRINTLN AS IT WILL INSERT A NEWLINE CHARACTER
				
			}
			for(j=0;j<=i*2;j++) {
				System.out.print("*");  /// VERY IMPORTANT DONT USE PRINTLN AS IT WILL INSERT A NEWLINE CHARACTER
				
			}
						
	System.out.println();
			
		}
	
		
	}

}
