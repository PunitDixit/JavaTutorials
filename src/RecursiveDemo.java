
public class RecursiveDemo {

	public static void main(String[] args) {
     
		int num=4;
		
		for (int i=1; i<=num ;i++) {
   
		System.out.println("Fibonacci of "+i+" "+fib(i));  //  Till completion of program fib(1)=0, fib(2)=1, fib(3)=fib(3-1)+fib(3-2)=0+1=1, so on
		}                            // Values of all these methods will remain in stack area until completion of program and thats how it will work

		
		System.out.println("\nFactorial of "+num+" is "+fact(num));
		
	}

	

	static  int fib(int n) {
		int a =0, b=1 , c,d,e;
   if (n==1) 
      return 0;
   
   else if (n==2)
   return 1;
   
   else 
	   return fib(n-1)+fib(n-2);
   	
	}

	static int fact(int n) {
		
		if ((n==0)|| (n==1))
			return 1;
		else 
			return fact(n-1)*n;
		
	}
	
	
	
	

}
