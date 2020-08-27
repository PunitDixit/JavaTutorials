package ztest;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		char[] ch = str.toCharArray();
		
		int count[] = new int[126];
		
for (int i =0; i<ch.length;i++) {

	count[ch[i]]++;
		
}		

for (int i=0; i<ch.length;i++) {
	
	System.out.println(ch[i]+"***"+count[ch[i]]);
}

for(char c: ch) {
	if(count[c]==1) //First occurrence of non repeated character
	
		System.out.println(c+"  "+count[c]);
		
}


	}

}
