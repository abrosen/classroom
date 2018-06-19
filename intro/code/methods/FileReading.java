package methods;

import java.io.File;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        File f = new File("pg100.txt");
        try {
            Scanner reader = new Scanner(f);
            int count =0;
            while(reader.hasNextLine()) {
                String line = reader.nextLine();

                count++;
            }
            System.out.println(count);
        } catch (Exception e){
            System.out.println("uhhhh.....");
            e.printStackTrace();
        }
    }
}
