package arraylists;

import java.util.Scanner;

public class HowGenericsWork {
    public static void main(String[] args) {
        Box<Scanner> b =  new Box<Scanner>();

        Box<String> otherBox =  new Box<String>();
    }
}
