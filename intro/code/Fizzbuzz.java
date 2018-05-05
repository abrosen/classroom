import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Fizzbuzz {

    public static void fizzbuzz(int n ) {
        for (int i = 1; i <= n ; i++) {
            if(i % 3 == 0  && i % 5 == 0 ){
                System.out.println("fizzbuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }


    public static String smallestWord(String[] words) {
        String smallest = words[0];
        for (String word: words) {
            if(word.length() < smallest.length()) {
                smallest = word;
            }
        }
        return smallest.substring(0,3);
    }


    public static int atlSum(int[] nums) {
        int sum =  0;
        for (int i = 0; i < nums.length; i++) {
            if(i %2 == 0 ) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("book");
        Scanner input =  new Scanner(f);
        boolean readThisLine = true;
        while(input.hasNextLine()) {
            String line =  input.nextLine();
            if(readThisLine) {
                System.out.println(line);
                readThisLine =false;
            } else {
                readThisLine = true;
            }

        }

    }
}
