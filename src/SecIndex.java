
public class SecIndex {

	public static void main(String[] args) {
		
		String str = "Vika1sada";

		//FIRST WAY USING COUNT
		
		char findChar = 'a';
		
		int index=0, count=1;
		
		for (int i=0;i<str.length();i++)
		{
			
			if (findChar==str.charAt(i))
			{
				count++;
				if(count<=2)
				index =i;
			}
		}
		
		System.out.println(index);
		
		
	//SECOND WAY
		
		index =-1; //IMPORTANT TO NOTE ELSE FIRST CHARACTER WILL BE SKIPPED
		
		
//		index =str.indexOf('a');
//		index = str.indexOf('a', index+1);
//		System.out.println(index);
		
		//Using for loop
		
		for(int i=0;i<2;i++)
		{
			index = str.indexOf('a', index+1); //IMPORTANT ELSE ALWAYS SAME INDEX WILL BE THROWN
		}
		
		System.out.println(index);
		
		
		
		
		
		
		
	}

}
