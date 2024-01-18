import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		int[] tokens = new int[256];
		try {
			Scanner scanner =  new Scanner(new File("pg100.txt"));
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();

				for(int i = 0; i < line.length(); i++) {
					char c =  line.charAt(i);
					tokens[c]++;
				}
				
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(int i = 0; i< tokens.length; i++) {
			System.out.println((char) i + "\t"   + tokens[i]);
		}
		
	}
	
	

}
