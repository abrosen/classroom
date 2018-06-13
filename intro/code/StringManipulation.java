import java.util.Scanner;

public class StringManipulation {

    //TODO
    public static int findFirstVowel(String word){
        return -1;
    }

    //TODO
    public static String convertToPigLatin(String word) {
        int firstVowelIndex = findFirstVowel(word);


        return word + "ay";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("done")) {
            input =  scanner.nextLine();
            input = input.toLowerCase();
            String pigged = convertToPigLatin(input);
            System.out.println(pigged);
        }
    }
}
