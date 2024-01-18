package methods;

public class MyModule {


    public static void printMathFacts(double d) {
        System.out.println("The square root of d +1 is: " + Math.sqrt(d) + 1);
        System.out.println("The cube root of d is: " + Math.pow(d, 1.0/3.0));
        System.out.println("The cosine of d is: " + Math.cos(d));

    }


    // print all numbers from a to b, including a, excluding b
    // all numbers should be printed on the same line and seperated by commas.
    // |-|-|-|

    public static void printRange(int a, int b){

        for(int i = a; i < b - 1; i++){

                System.out.print(i + ", ");

        }
        System.out.println(b-1);
        /*
        for(int i = a; i < b; i++){
            if(i == a) {
                System.out.print(i);
            }else {
                System.out.print(", " + i);
            }
        }*/
    }


    public static int giveMeOne() {
        return 1;
    }

    public static int doubleThis(int x){
        x = x * 2;
        return x;
    }






    public static void methodsPassByCopy(int x, int y, int z){
        x +=z;
        y = y +200/z;
        z = x+1;
    }

    public static String objectsCopyReference(String text){
        text = text.substring(0,10);
        return text;
    }


    public static void printEveryChar(String s) {
        //       01234
        // s is "HELLO"
        // 5 chars long
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    // HELLO -> HLO
    // HAHAHAHA -> HHHH
    public static String everyOtherChar(String s) {
        //s = s.toLowerCase();
        String output = "";
        for(int i = 0; i <s.length() ;i+=2){
            char c = s.charAt(i);
            output = output +c;
        }


        return output;
    }

    
}
