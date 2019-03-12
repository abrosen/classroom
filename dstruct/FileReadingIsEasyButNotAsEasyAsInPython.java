import java.io.File;
import java.util.Scanner;

public class FileReadingIsEasyButNotAsEasyAsInPython {

    public static void main(String[] args) {
        File thingToRead =  new File("shakespeare.txt");

        try{
            Scanner scanner =  new Scanner(thingToRead);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch(Exception e ) {
            System.err.println("Whoops");
        }


    }

}
