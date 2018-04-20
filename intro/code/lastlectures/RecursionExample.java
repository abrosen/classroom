package lastlectures;

import java.sql.SQLOutput;

public class RecursionExample {





    // n! = n * n-1 * n - 2 ... 3 * 2 * 1
    // 0! = 1
    // 5! = 1*2*3*4*5;

    public static long factorial(int n){
        long product = 1;
        for(int i = 1; i <= n; i++){
            product *= i;
        }

        return product;
    }


    // 5! = 5*4*3*2*1 = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    // 1! = 1 * 0!
    // 0! = 1

    // n! =  n * (n-1)!  if n > 0
    //    =  1  if n == 0

    public static long fact(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }





    public static void main(String[] args) {

        int[] arr =  {1,3,4,5,6,7,9,52,100};
        System.out.println(fact(20));
    }
}
