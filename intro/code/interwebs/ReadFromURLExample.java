package interwebs;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFromURLExample {

	public static void main(String[] args) {
		Integer i = null;
		System.out.println(i);
		
		/*
		try {
			URL url =  new URL("https://www.google.com");
			Scanner scanner =  new Scanner(url.openStream());
			
			int numLinks = 0;
			
			while(scanner.hasNextLine()) {
				String line  = scanner.nextLine();
				System.out.println(line);
				
				for(int i = 0; i< line.length() -3;i++) {
					char c =  line.charAt(i);
					if (c == 'h' && line.substring(i, i+4).equals("href")) {
						numLinks++;
					}

				}
				
			}
			System.out.println(numLinks);
			scanner.close();
			
		}catch(Exception e) {
			System.err.println("Something dun goofed.");
			e.printStackTrace();
		}
		*/
		
		
		try {
			URL imgURL = new URL("https://www.google.com/logos/doodles/2017/gertrude-jekylls-174th-birthday-6002071852548096-l.png");
			InputStream stream=  imgURL.openStream();
			Files.copy(stream, Paths.get("../jekyll.png"));
			
			
		}
		catch(Exception e) {

			System.err.println("Something dun goofed.");
			e.printStackTrace();
		}

	}
	
	

}
