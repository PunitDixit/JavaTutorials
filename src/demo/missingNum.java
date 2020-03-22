package demo;

public class missingNum {

	public static void main(String[] args) {
		
		int  num [] = {1,2,3,5,6,7,8,9,10};
		int temp=0;
		System.out.println(num.length);
		for (int i = 0; i<num.length;i++) {
			System.out.println(num[i]);
			temp = temp+num[i];
			
		}
int num2=0;
		for (int j=1;j<=10;j++) {
			
			num2 = num2+j;
		}
		
		System.out.println("Missing number is :"+(num2-temp));
	}

}
