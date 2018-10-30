package hashtables;

import java.io.File;
import java.util.*;

public class IndexHashExample {


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("pg100.txt"));
            int lineNumber = 0;
            Map<String, List<Integer>> index = new HashMap<>();

            while(scanner.hasNextLine()){
                lineNumber++;
                String line = scanner.nextLine();
                String[] words  =line.split(" ");
                for (String word : words) {
                    if(index.containsKey(word)){
                        index.get(word).add(lineNumber);
                    } else {
                        List<Integer> l =  new ArrayList<>();
                        l.add(lineNumber);
                        index.put(word, l);
                    }
                }
            }

            for (String word : index.keySet()) {
                System.out.println( word + "\t" +  index.get(word).size() + "\t" + index.get(word));
            }

        } catch (Exception e){
            System.err.println("Uh - oh");
        }

    }
}
