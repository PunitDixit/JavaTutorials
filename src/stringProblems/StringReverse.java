package stringProblems;

public class StringReverse {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "Kava";
		
		
		String str = "Hello World";
		
		StringBuffer buffer = new StringBuffer(str);
		
		StringBuffer buffer2 = new StringBuffer();
		System.out.println(buffer2);
		
		System.out.println(buffer.reverse());  //REVERSE
		
		buffer.replace(0, 4, "Punit");  //REPLACE
		System.out.println(buffer);
		
		System.out.println("substring "+ buffer.substring(3));
		System.out.println("Substring_startend: "+buffer.substring(3, 6));
		
		System.out.println("append: "+buffer.append(false));
		
		System.out.println(buffer.capacity());
		
		System.out.println(buffer.charAt(1));
		
		System.out.println(buffer.indexOf("ll"));
		
		System.out.println(buffer.lastIndexOf("l"));
		
	
		/// SEcond way of reversing string
		
		String str2 = "Hello World";
		
		char[] strArr = str2.toCharArray(); // REMEMBER IT RETURNS CHAR ARRAY
		
		
		String strRev = "";
		for(int i=strArr.length-1;i>=0;i--) {
			
			strRev = strRev+strArr[i];
			
		}
		
		System.out.println(strRev);
		
		
		
		
		
		
		
		
	}

}
