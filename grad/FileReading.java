import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {

        String[] lines;
        File target = new File("shake.txt");
        try {
            Scanner scanner = new Scanner(target);
            int numLines = 0;
            while(scanner.hasNextLine()){

                String line = scanner.nextLine();
                numLines++;
                //System.out.println(line);

            }
            System.out.println(numLines);
            lines = new String[numLines];

            scanner = new Scanner(target);
            int i = 0;
            while(scanner.hasNextLine()){

                String line = scanner.nextLine();
                lines[i] = line;
                i++;
                System.out.println(line);

            }

            System.out.println(lines[4]);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
