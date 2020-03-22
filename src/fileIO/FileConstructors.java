package fileIO;

import java.io.File;
import java.io.IOException;

public class FileConstructors {

	public static void main(String[] args) throws IOException {
		
		File fileInWorkingDirectory =  new File("D:\\SampleFile.txt");
		fileInWorkingDirectory.createNewFile();
		
		File fileInOtherDirectory = new File("D:\\folder","SampleFile.txt");
		fileInOtherDirectory.createNewFile();
		
		
	}

}
