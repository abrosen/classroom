package files;

import java.io.File;
import java.util.Scanner;

public class FileReading {

	
	public static void main(String[] args) throws Exception{
		for(int i = 0; i<10; i++) {
			if(i %2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		File f = new File("shakespeare.txt");
		Scanner reader  = new Scanner(f);
		int numLines = 0;
		while(reader.hasNextLine()) {
			String line =  reader.nextLine();
			int endOfFirstWord = line.indexOf(" ");
			if(endOfFirstWord == -1) {
				continue;
			}
			
			System.out.println(line.substring(0, endOfFirstWord));
			
		}
		
	}
}
