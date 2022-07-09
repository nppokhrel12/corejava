package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingReader {
	
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("d://testcsv.csv");
		BufferedReader buffer =new BufferedReader(file);//cache maa file ko data liera raakhxa tesaile fast
		
		String line;
		while ((line=buffer.readLine())!=null) {
			System.out.println(line);
			
		}
	}

}
