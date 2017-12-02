import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FileReadingExample {

	public static void main(String[] args) {
		/*
		int x = 1;
		try {
			System.out.println(x/0);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println(x);
		*/
		

		File file = new File("pg100.txt");
		try {
			Scanner scanner = new Scanner(file);
			int lines = 0;
			while(scanner.hasNextLine()) {
				lines++;
				String  line = scanner.nextLine();
				
			}
			System.out.println(lines);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Scanner webreader = new Scanner( new URL("https://xkcd.com").openStream()  );
			while(webreader.hasNextLine()) {
				
				String  line = webreader.nextLine();
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Finished reading");

	}

}
