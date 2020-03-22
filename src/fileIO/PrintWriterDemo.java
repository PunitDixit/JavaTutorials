package fileIO;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
   // Most advanced writer 
	public static void main(String[] args) throws IOException {
		
		
		//Can PRINT ANY DATA TYPE AS IT IS. CAN COMMUNICATE DIRECTLY OR VIA ANY WRITER WITH FILE
		
		PrintWriter pw = new PrintWriter("FilePAth");
		
		PrintWriter pw2 = new PrintWriter(new File("Path"));
		
		    BufferedWriter bw = new BufferedWriter(new FileWriter("Path"));
		
		PrintWriter pw3 = new PrintWriter(bw);
		
		//Methods
		
		pw.append("String");
		pw.write("String or character or character array");
		pw.flush();
		pw.close();
		pw.println("By default NewLine Character");
		
		
	}

}
