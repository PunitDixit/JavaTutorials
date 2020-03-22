package demo;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		//NOTE THAT FOR REGULAR EXPRESSION ONLY REPLACEALL OR REPLACEFIRST CAN BE USED
		
		String str = "Hel37@#%$#&llo }{AllllDLKVDJ";
		String str2 = str;
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "")); //OBSERVE THE REGULAR EXPRESSION, THERE IS NO COMMA
		
		//Count No of l in str
		System.out.println(str.length());
		System.out.println(str.replaceAll("[l]", "").length());
		
		System.out.println(str2.replaceFirst("[^a-zA-Z0-9]", "")); //Removed @ only i.e. it works only for once
	}

}
