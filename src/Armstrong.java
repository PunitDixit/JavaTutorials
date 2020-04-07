
public class Armstrong {

	public static void main(String[] args) {
		
		
		int num=153;
		int num1 = num;
		double temp=0;
		double arm =0;
		
		while (num1>0) {
		temp = num1%10;
		num1 = num1/10;
		
		arm =arm+ Math.pow(temp, 3);
		
		}
		
		if (num==arm)
		{
			System.out.println("its an armstrong number");
		}
		else System.out.println("not");
				
				
	}

}
