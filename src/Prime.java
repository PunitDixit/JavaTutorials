
public class Prime {

	public static void main(String[] args) {
		
		int n=1;
		
		
		prime(n);
		
		
	}

	static void prime(int n) {
		
		if(n>2)
		{
		boolean flag = true;
		for(int i=2;i<n/2;i++)
		{
			if (n%i==0)
			{
				flag=false;
			break;
			}
		}
		
		if(flag)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		}
		
		else if(n==2)
		
		{System.out.println("2 is a prime number");}
		
		else
		{
			System.out.println("Invalid input");
		}
		
		
	}
	
	
}
