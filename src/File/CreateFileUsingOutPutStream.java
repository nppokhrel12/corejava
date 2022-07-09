package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingOutPutStream {
	/*
	 * to read general files 
	 * 1.FileInputStream -> file read
	 * 2.FileOutputStream -> file write
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("d://hello.txt");
		file.write("hello".getBytes());
		file.close();
		System.out.println("file create");
	}

}
