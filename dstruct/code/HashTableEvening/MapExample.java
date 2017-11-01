package HashTableEvening;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	
	
	
	
	public static void main(String[] args) {
		
		Map<String, String> favoriteColors =
				new HashMap<String, String>();
		
		favoriteColors.put("Alice", "Blue");
		favoriteColors.put("Barbara", "Perrywinkle");
		favoriteColors.put("Carl", "Blue");
		favoriteColors.put("Carl", "Red");
		
		
		
		System.out.println(favoriteColors);
		
		for(String s : favoriteColors.keySet()) {
			System.out.println(s + " " + favoriteColors.get(s));
		}
		
	}

}
