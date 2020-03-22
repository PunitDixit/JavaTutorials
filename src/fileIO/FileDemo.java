package fileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("D:\\file.txt"); //Creates only file object not a physical file
		
		File folder = new File("D:\\\\folder");
		
		System.out.println("Checks if file exists: "+file.exists());
	
		file.createNewFile(); //Creates physical file
		folder.mkdir(); //creates folder
		
		System.out.println("Checks if file exists: "+file.exists());
		
		
		
		
	}

}
