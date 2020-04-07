import java.io.IOException;

public class recursionDem {

	public static void main(String[] args) throws IOException {
		
	
	int num = 6;
	
	for (int i=1;i<=num;i++) {
		System.out.println("\nI value: "+i);
	System.out.print("******"+fibRec(i)+"******");
	}
	
	System.out.println(" \n factorial "+factRec(num));
	
	}

	
	public static int fibRec(int num)
	{
		System.out.println("inside fibrec method: "+num);
				
		if (num==1) 
			return 0;
		else if(num==2)
			 return 1;
		else if(num>2)
		    return fibRec(num-1)+fibRec(num-2);
		else
			return 0;
		
		
	}
	
	public static int factRec(int num) {
		
		if (num==1 || num==0)
			return 1;
		else if (num<0)
			return 0;
		else
		    return num*factRec(num-1);
		
	}
	
	
	
	
	
}
