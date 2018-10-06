package recursion;

public class RecursionExamples {








    // 5! =  5 * (4 * 3 * 2 * 1)
    // 5! =  5 * 4!

    // 0! = 1
    // 1! = 1
    // 2! = 2
    // 3! = 6
    // 4! = 24 = 4 * 3!
    // 5! = 120
    public static long factorial(int n) {
        if(n < 0 ){
            return -1;
        }
        if(n == 0) {
            return 1;
        }

        long product = 1;
        for (int i = 1; i <= n ; i++) {
            product *= i;
        }

        return product;
    }



    public static void foo() {
        System.out.println("foo!");
        foo();
    }

    // 5! = 5*4!
    // 5! = 5*4*3*2*1
    // n! = {  1          ,  if n is 1 or 0
    //      {  n * (n-1)!    otherwise
    public static long fact(int n) {
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }

    /*
    * length("food")
    *   4
    *                      3
    *                                       2
    *                                                         1   +         0
    *                                                                           0
     */

    public static int length(String s){
        if(s.equals("")){
            return 0;
        } else {
            return 1 + length(s.substring(1));
        }
    }

    /* "food"
     *   ood   + f
     *    od     o
     *     d     o
     *     ""    d
      *
      *   */

    public static void printChars(String s) {
        if(s.equals("")){
            System.out.println("");
        } else {
            System.out.println(s.charAt(0));
            printChars(s.substring(1));
        }
    }


    // 1 + 2 + 3 ... + (n-1) + n
    // 5 + 4 + 3 + 2 + 1
    // 5 + summation(4)
    public static int summation(int n) {
        if(n <= 0){
            return 0;
        }

        return n + summation(n-1);
    }


    public static void main(String[] args) {

        foo();
        //printChars("hello");
        //System.out.println(summation(5));
    }
}
