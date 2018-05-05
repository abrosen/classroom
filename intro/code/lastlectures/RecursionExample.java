package lastlectures;

import java.sql.SQLOutput;
import java.util.Arrays;

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



    // x^n =  x*x*x*x...*x*x
    // 2^5 = 32 = 2*2*2*2*2  = 2 * 2^4
    // 2^4 = 16 = 2*2*2*2    = 2 * 2^3
    // 2^3 = 8  = 2*2*2      = 2 * 2^2
    // x^n  =  x * x^(n-1) if n >0
    // x^n  =  1/x^(-n)            if n < 0
    //      = 1            if n == 0

    public static double pow(int base, int exp) {
        if(exp == 0) {
            return 1;
        } if( exp < 0) {
            return 1 /  pow(base, -1*exp);
        }
        else {
            return base * pow(base, exp - 1);
        }
    }

    /*  big   small   big% small
        15     8        7
        8      7        1
        7      1

    */
    public static int gcd(int big, int small){
        if(big % small == 0) {
            return small;
        } else {
            return gcd(small, big % small);
        }
    }




    public static int search(int[] arr,  int target){
        return search(arr, target, 0, arr.length -1);
    }

    private static int search(int[] arr, int target, int first,int last) {
        if(last < first) {
            return -1;
        }
        else{
            int middle = (first + last)/ 2;
            int middleValue = arr[middle];
            if(target == middleValue){
                return middle;
            }

            if( target < middleValue) {
                return search(arr , target, first, middle -1);
            } else {
                return search(arr, target, middle +1, last);
            }


        }
    }


    public static void fargo(float[][]  someArray) {
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++) {
            array[i]  = i;
        }
        int index = 0;
        array[index] = 1;
        index = array[array[index] + 1];
        array[index]  = array[array[index] -1];
        array[array.length -1 ] = 2;
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        //fargo();
    }
}
