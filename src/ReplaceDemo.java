
public class ReplaceDemo {

	public static void main(String[] args) {
		
		
		String str = "Hello my name is Hello";
		
		String arr[] = str.split(" ");
		
		for(String s : arr) {
			
			System.out.println(s);
		}
		
		System.out.println(arr[0].replaceAll("Hello", ""));
		arr[0]=arr[0].replaceAll("Hello", "");
				System.out.println(arr[0]);
				
				System.out.println(arr.length);
	}

}
