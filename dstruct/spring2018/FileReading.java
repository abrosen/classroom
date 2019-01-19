import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        File file = new File("pg100.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
