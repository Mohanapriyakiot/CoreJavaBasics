package ioStreams;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is the data in the output file";
		
		try {
			//Creates the FileWriter
			FileWriter output=new FileWriter("output.txt");
			//Writes the String to the file
			output.write(data);
			output.flush();
			
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
