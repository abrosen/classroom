package lastlectures;

import jdk.management.cmm.SystemResourcePressureMXBean;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Crawling {


    public static void main(String[] args) {

        String s = "hello world, how are you?";
        System.out.println(Arrays.toString(s.split(" ")));



        try {
            System.out.println("In try");
            URL target = new URL("https://en.wikipedia.org/wiki/URL");
            Scanner scanner =  new Scanner(target.openStream());
            System.out.println("Success");

            int numLinks  = 0;


            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word: words) {
                    if(word.startsWith("href")){
                        numLinks++;
                    }

                }


            }
            System.out.println(numLinks);

        } catch (Exception e) {
            System.err.println("Oops, bad url");
            e.printStackTrace();
        }

        System.out.println("Done with program");

    }
}

