package arrays;

public class Searching {

    public static int search(String[] words, String target) {

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] test = {"Hello", "how", "are", "you"};
        System.out.println((search(test,"you")));
    }
}
