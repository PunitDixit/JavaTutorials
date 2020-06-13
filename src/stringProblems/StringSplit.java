package stringProblems;

public class StringSplit {

	public static void main(String[] args) {
		
		String str = "Val1=20,Val2=30,Val3=40";
		
		String [] split = str.split(",");
		System.out.println(split.length);
		
		for(int i = 0 ; i<str.length();i++)
		{
			String [] splitInner = split[i].split("=");
			
			if(splitInner[0].equals("Val2"))
					{System.out.println("Value 2 = "+splitInner[1]);
					break;}
				
					
		}
			
		}
		
		
		
		
		
	}


