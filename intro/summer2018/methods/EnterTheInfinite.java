package methods;

import java.util.Scanner;

public class EnterTheInfinite {

    public static void oops(){

        for(int i = 10; i >0; i++){
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        oops();
        Scanner in =  new Scanner(System.in);
        while(true){
            System.out.println("Input");
            String word = in.nextLine();
            if(word.equals("please") ){
                break;
            }
            System.out.println("You didn't say the magic word!");
        }
    }
}
