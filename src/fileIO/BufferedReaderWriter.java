package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("File path");
		
		
		
		//IMPORTANT: BUFFERED READER CANNOT DIRECTLY COMMUNICATE WITH FILE
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		System.out.println(br.read()); // reads a character unicode Until -1 occurs it reads
		System.out.println(br.readLine());//reads a line  until NULL occurs
		
		
		//BufferedWriter provide newline method to enter a new line character
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		bw.write("String or character array");
		
		bw.newLine(); // THIS IS THE METHOD WHICH IS NOT PRESENT IN FILEWRITER
		
		bw.append("String2"); //For appending It is from super class i.e. Write class
		
		bw.flush();
		
	}

}
