package pattern;

public class Pattern2 {

	public static void main(String[] args) {

		System.out.println("First Pattern");
		//		*
		//		**
		//		***
		//		****

		for (int i=0; i<4; i++)
		{
			for (int j=0; j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println();

		}

		//		****
		//		***
		//		**
		//		*

		for (int i=4;i>0;i--)
		{
             for (int j=i;j>0;j--)
             {
            	 System.out.print("*");
             }
           			System.out.println();
		}




	}
}