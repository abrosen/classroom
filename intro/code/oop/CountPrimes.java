package oop;

import java.util.Scanner;

public class CountPrimes {

	
	
	
	public static void main(String[] args) {
		double d =Circle.PI;
		Scanner console = new Scanner(System.in);
        System.out.print("Max number? ");
        int max = console.nextInt();
        for (int i = 2; i <= max; i++) {
            if (Factors.isPrime(i)) {
                System.out.print(i + " ");
        }   }
        System.out.println();

	}
}
