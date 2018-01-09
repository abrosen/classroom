import java.util.Scanner;

public class WhileLoop {

	/*
	public static void fred() {
		System.out.println("hi");
		fred();
	}*/

	
	public static void printDigits(int n) {
		String s = "";
		while(n > 0) {
			s = s + n%10;
			n = n / 10;
		}
		
		for(int i = s.length() - 1; i>=0 ; i--) {
			System.out.println(s.charAt(i));
			
		}
		
		/*int biggestDivider = 1;
		while(n / biggestDivider > 10 ) {
			System.out.println(biggestDivider +"  doesn't divide the biggest digit") ;
			biggestDivider *=10;
		}
		System.out.println(n);
		
		System.out.println(biggestDivider);
		
		
		
		while( biggestDivider > 0) {
			System.out.println(n /  biggestDivider);
			n %= biggestDivider; 
			biggestDivider =  biggestDivider / 10;
			 
		}*/
		
	}
	
	
	public static void average() {
		Scanner console = new Scanner(System.in);
		double sum = 0;
		int count =  0;
		int number = 1;   // "dummy value", anything but 0

		while (number != 0) {
		    System.out.print("Enter a number (0 to quit): ");
		    number = console.nextInt();
		    if(number == 0 ) {
		    	break;
		    }
	
		    sum = sum + number;
		    count++;
		}

		System.out.println("The total is " + sum/count);

	}

	public static void main(String[] args) {
		printDigits(12345);
		//average();
		//fred();

		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0 ) {
				System.out.println(i);
				System.out.println(i);
			}
		}
		/*
		int i = 1;
		while( i <= 10) {
			if(i % 2 == 0 ) {
				System.out.println(i);
				System.out.println(i);
			}
			i++;
		}
		System.out.println(i);
		*/
		
		
	}
}
