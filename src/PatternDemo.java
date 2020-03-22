
public class PatternDemo {

	public static void main(String[] args) {


		
		String message = "Hello";
		
		for (int i=0;i<message.length();i++) {
			System.out.println(message.charAt(i+1));
		}
		
		
		for (int i =1; i<=5;i++) {


			for(int k=1;k<=i;k++)
			{
				if (i >=2 && k<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}

			System.out.println();
		}


		for (int i =1; i<=5;i++) {


			for(int k=5;k>=i;k--)
			{
				if (i<5 && k>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}

			System.out.println();
		}


		
		
		for (int i =1; i<=5;i++) {


			for(int k=1;k<=i;k++)
			{
				
				if (i==k) {
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}

			System.out.println();
		}


	}

}
