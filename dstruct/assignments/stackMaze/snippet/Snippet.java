package snippet;

public class Snippet {
	public  static void permutation(String word) {
		permutation("",word);
	}
	
	private static void permutation(String current, String restOfWord){
		if(restOfWord.equals("")){
			System.out.println(current);
		} else {
			for(int i = 0; i< restOfWord.length();i++) {
				permutation(current + restOfWord.charAt(i),
				restOfWord.substring(0, i) + restOfWord.substring(i+1));
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		permutation("hello");
	}
}

