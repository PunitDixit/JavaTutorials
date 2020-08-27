package crestron;

public class Demo2 extends Demo{

	public static void main(String[] args) {


		String str = "mmn";

		char [] ch  = str.toCharArray();

		int flag;

		 for (int i=0;i<ch.length;i++) {

			
			flag=0;
			for (int j=i+1;j<ch.length;j++)
			{

				if (ch[i]==ch[j])
				{
					flag =1;
					break;

				}	
				
				
			}
			if (flag==0) {
System.out.println(ch[i]);
			break;}
		}




	}


	void display() {

	}

}
