package test;

public class Demo {

	public static void main(String[] args) {


		String str [] = {"are","hello","welcome", "are"};


		String srch = "are";
		int count=0;

		for (int i=0;i<str.length;i++) {

			if(srch.equals(str[i])) {

				count++;

			}

		}

		System.out.println(srch+ " occured for no of times:" +count );



	}

}
