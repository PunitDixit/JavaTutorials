package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//SubClass of InputStreamReader and OutputStreamWriter
public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		
		//Basic level read write class for files
		
		File file = new File("File path");
		
		FileWriter fw = new FileWriter(file); //Overrides the existing file
		FileWriter fw_append = new FileWriter(file,true); // Acts as appender
		
		//To write text or String
		fw.write("Enter String");
		
		//Drawback: Newline character is entered manually
		fw.write("\n");
		
		
		//To write character array
		char [] ch =  {'a','b'};
		
		fw.write(ch );
		
		//To gaurantee that everything is written to the file
		fw.flush();
		
		//To close the file writer 
		fw.close();
		
		//***************************************************************
		
		FileReader fr = new FileReader(file);
		
		//Drawback: READS CHARACTER BY CHARACTER, TIME CONSUMING. BUFFERRED READER READS LINE BY LINE
		
		fr.read(ch); //read a character array
		
		fr.read(); //returns unicode Use cast (char)
		
		
		
		
		
		
		
		
	}

}
