package demo;

public class Seggregate {

	public static void main(String[] args) {

		//FIRST WAY
		
		String str = "asSDd24$53y3$Q*Q#Y";

		System.out.println("Only Special Characters "+str.replaceAll("\\w", ""));//same as str.replaceAll("[a-zA-Z0-9]", "")


		System.out.println("Only numbers and alphabets "+str.replaceAll("[\\W]", ""));

		System.out.println("Only numbers* "+str.replaceAll("[^\\d]", ""));

		String s = str.replaceAll("[\\W]", "");

		System.out.println("Only numbers "+s.replaceAll("[a-zA-Z]", ""));

		System.out.println("Only alphabets "+s.replaceAll("[0-9]", ""));		


		//SECOND WAY
		System.out.println();
		System.out.println("SECOND WAY");
		String alphabet ="";

		String numeric="";

		String alpha="";

		str = "Aa12%$";
		for(int i=0; i<str.length();i++)
		{

			char c = str.charAt(i);
			if(c>='a' && c<='z' || c>='A' && c<='Z')
			{
				alphabet = alphabet+c;
			}
			else if (c>=0 && c<=9) {
				numeric =numeric+c;
			}
			else {
				alpha=alpha+c;
			}

		}

		System.out.println(alphabet);	
		System.out.println(numeric);
		System.out.println(alpha);



		//THIRD WAY
		System.out.println();
		System.out.println("THIRD WAY");
		str = "ZS23#*";
		alpha="";
		alphabet="";

		for(int i=0; i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alphabet=alphabet+str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numeric=numeric+str.charAt(i);
			}
			else
				alpha=alpha+str.charAt(i);
		}

		System.out.println(alpha);
		System.out.println(alphabet);
		System.out.println(numeric);







		//Here
		//
		//  \w : A word character, short for [a-zA-Z_0-9]
		//
		//   \W : A non-word character

		//System.out.println("Only Special Characters "+str.replaceAll("[a-zA-Z0-9]", ""));		
		//
		//System.out.println("Only Special Characters "+str.replaceAll("\\w", ""));//same as str.replaceAll("[a-zA-Z0-9]", "")
		//
		//System.out.println("Replaces Special char "+str.replaceAll("[\\W]", ""));
		//
		//System.out.println("Replaces one special char at a time "+str.replaceAll("\\*", ""));
		//
		//System.out.println("Replaces multiple special char at a time using OR"+str.replaceAll("\\*|\\#", ""));
		//		
		//		

	}

}
