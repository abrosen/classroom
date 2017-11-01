package HashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(new Integer(13949134).hashCode());
		
		
		Map<String, String> faveColors = new HashMap<String, String>();
		faveColors.put("Alice", "red");
		faveColors.put("Bob", "purple");
		faveColors.put("Carl", "red");
		faveColors.put("Dan", "blue");
		System.out.println(faveColors.get("Alice"));

		
		Map<String, Integer> wordCount =  new HashMap<String,Integer>();
		Scanner scanner = new Scanner(new File("pg100.txt"));
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] words = line.split(" ");
			
			for(String word :words) {
				if(wordCount.containsKey(word)) {
					int occurences = wordCount.get(word);
					wordCount.put(word, occurences + 1);
				} else {
					wordCount.put(word, 1);
				}
			}
			
		}
		System.out.println(wordCount.get("the"));
		
	}
}

