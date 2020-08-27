package stringProblems;

public class CharacterFirstUniqueOccurence {

	public static void main(String[] args) {

		String str = "mmaan";


// First way: Using indexof anf LastIndexOf

		for(int i=0; i< str.length();i++) {

			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {

				System.out.println(str.charAt(i));
				break;

			}

		}

		
		System.out.println(firstNonRepeatChar(str));
		



	}

	//Second way : int[256]
	public static Character firstNonRepeatChar(String s){
		int[] found = new int[256];
		char[] chars = s.toCharArray();

		for(int i=0; i< chars.length; i++)
		found[chars[i]]++;

		for(int i=0; i< chars.length; i++){
		if(found[chars[i]]==1)
		return chars[i];
		}
		return null;
		}
	
	
}
