import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryHard {

    public static void main(String[] args) {

        File f =  new File("pg100.txt");
        try {
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String line =  scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
            //int x = 1/0;
        } catch (FileNotFoundException e) {
            System.out.println("That file does not exist!");

        }
        catch (Exception e) {
            //System.out.println("Here's your error report!");
            //e.printStackTrace();
            System.out.println("Well, that was weird!");
        } finally {
            System.out.println("Done");
        }

        System.out.println("My program didn't crash!");
    }
}



