package File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWithWriter {
	/*
	 * to process text file or docs files 
	 * 1. FileWriter : file write
	 * 2. FileReader: file read
	 */
	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("d://myfile.docs",true);
		file.write("id:3");
		file.write(System.lineSeparator());
		file.write("name:meu");
		file.close();
		System.out.println("created");
		//file.flush();
		
	}

}
