package tables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Fun1 {

	
	public static boolean hasDups(String word){
		Set<Character> set = new HashSet<Character>();
		for(Character c : word.toCharArray()){
			if(set.contains(c)){
				return true;
			}
			set.add(c);
			
		}
		
		
		return false;
	}
	
	public static boolean isPermutation(String s1, String s2){
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		Map<Character, Integer> map2 =  new HashMap<Character, Integer>();
		
		
		char[] c1 =  s1.toCharArray();
		char[] c2 =  s2.toCharArray();
		for(char letter : c1){
			if( map.containsKey(letter)){
				int prev = map.get(letter);
				map.put(letter, prev +1);
			} else{
				map.put(letter, 1);
			}
			
		}
		
		for(char letter : c2){
			if( map2.containsKey(letter)){
				int prev = map.get(letter);
				map2.put(letter, prev +1);
			} else{
				map2.put(letter, 1);
			}
			
		}
		
		for(char letter: c1){
			if(!map.get(letter).equals(map2.get(letter))){
				return false;
			}
			
		}
		
		
		for(char letter: c2){
			if(!map.get(letter).equals(map2.get(letter))){
				return false;
			}
			
		}
		
		return true;
		
	}
	
	
	
	public static Map freqCount(String s){
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map=  new TreeMap<Character, Integer>();
		
		for(char c: charArray){
			if(!map.containsKey(c)){
				map.put(c, 1);
			} else {
				int prev = map.get(c);
				map.put(c, prev +1);
			}
		}
		
		return map;
		
	}
	
	
	public static void main(String[] arg) { 
		
		Map m = freqCount("Hello, world! How are you today?");
		System.out.println(m);
	}
	
}
