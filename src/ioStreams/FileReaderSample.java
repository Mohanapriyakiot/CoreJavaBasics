package ioStreams;

import java.io.FileReader;

public class FileReaderSample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[100];
		
		try {
			//Creates a reader using the fileReader
			FileReader input=new FileReader("E:\\SDET Training WS");
			//Reads characters
			input.read(arr);
			System.out.println("Data in the File: ");
			
			System.out.println(arr);
			//close the Reader
			input.close();
		}
		catch(Exception e) {
			
		}
	}

}
