package examReview;

import java.util.Scanner;

import oop.Factors;

public class Exam1 {

	public static String eachChar(String str) {
		String out = "";
		
		for(int i = 0 ; i < str.length() - 1; i++) {
			out = out + str.charAt(i) + ", ";
		}
		
		out  =  out + str.charAt(str.length() -1);
		return out;
	}
	
	public static int countDigits(int n) {
		int numDigits = 0;
		
		while(n > 0) {
			n= n/ 10;
			numDigits++;
		}
		return numDigits;
	}
	
	public static int sumThrees(int n) {
		if(n <= 0) {
			return 0;
		}
		
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += 3*i;
		}
		return sum;
		
	}
	
	public static void print2Powers(int n ) {
		for(int i = 0; i < n; i++) {
			System.out.println(Math.pow(2,i));
		}
	}
	
	public static void printFactors(int n) {
		for(int i = 1; i < n; i++  ) {
			if(n%i ==0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factors.isPrime(100);
		
		printFactors(100);
		print2Powers(6);
		System.out.println(countDigits(1));
		/*
		Scanner kb = new Scanner(System.in);
		int input = 0;	
		int sum  = 0;
		while(input != 13) {
			System.out.println("Enter a number (13 to quit)");
			input = kb.nextInt();
			sum += input;
		}
		System.out.println(sum);
		
		
		
		System.out.println(eachChar("h"));
		
		System.out.println(32/8 != 32.0/8);
		int x = 5;
		int y = 3;
		
		
		if(x % y  == 0) {
			
		}
		
		if( (x % 2 == 0 && y % 2 == 1) ||  (x % 2 == 1 && y % 2 == 0)) {
			
		}
		
		
		/*
		int i = 2;
		while(i > 0) {
			System.out.println("!");
			i -= 1;
		}*/
		
		/*
		for(int i = 2; i > 0; i -= 1) {
			System.out.println("!");
		}
		
		for(int i = 5; i >= 1;  i--) {
			for(int j = i; j>= 1; j--) {
				System.out.print(j*2 + " ");
			}
			System.out.println();
		}*/
		
	}

}
