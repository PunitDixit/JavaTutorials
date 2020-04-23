import java.io.IOException;

public class Fibonacci {

	public static void main(String[] args) throws IOException {


		int num = 10;
		fib(num);

	}

	public static void fib(int num)
	{
		int a=0,b=1,c=0;
		for (int i=1; i<=num;i++)
		{
			if(i==1)
				System.out.println(a);
			else if(i==2)
				System.out.println(b);
			else 
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}


	}




}
