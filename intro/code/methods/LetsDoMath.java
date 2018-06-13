package methods;

import java.io.File;
import java.util.Scanner;

public class LetsDoMath {

    public static void main(String[] args) {
        MyModule.printMathFacts(5.0);
        MyModule.printRange(2,10);

        int  x = 5 + MyModule.giveMeOne();
        System.out.println(x);
        int y = MyModule.doubleThis(x);  //passing in 6
        System.out.println(x + " " +y);
        int z =157;
        MyModule.methodsPassByCopy(z,y,x);
        System.out.println(x +" "+ y + " "+ z);

        String lotsOfText = "Just pretend this is like a giant book or something, guys, okay?";
        System.out.println(   MyModule.objectsCopyReference(lotsOfText));
        MyModule.printEveryChar("GOOD");
        System.out.println(MyModule.everyOtherChar("LOLOLOL"));
        /*int a = 5;
        int b = 7;
        double c = 3.5;
        int exponent = 1;
        for(int i = 0; i < b; i++){
            exponent *= a;
        }
        System.out.println(exponent);

        System.out.println(  Math.pow(a,c));
        */
    }
}
