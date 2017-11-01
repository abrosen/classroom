package HashTableEvening;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner =  new Scanner(new File("pg100.txt"));

		Map<String, Integer> wordCount = 
				new HashMap<String, Integer>();
		
	
		while(scanner.hasNextLine()) {
			String line =  scanner.nextLine();
			String[] words =  line.split(" ");
			//System.out.println(line);
			
			for(String word: words) {
				if(!wordCount.containsKey(word)) {
					wordCount.put(word, 1);
				} else {
					int occurences =  wordCount.get(word);
					wordCount.put(word, occurences +1);
				}
			}
			
		}
		
		System.out.println( wordCount.get("the"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
