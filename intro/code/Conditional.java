import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = 10;
		
		if( x < 10) {
			System.out.println("x was less than 10");
		} else {
			System.out.println("x was not less than 10");
		}
		
		System.out.println("Done");
		*/
		

		double gpa = 3.2;
		if(gpa >= 3.5 ) {
			System.out.println("faculty honors");
		} else if(gpa >= 3.0  && gpa < 3.5) {
			System.out.println("Dean's list");
		}
	}

}
