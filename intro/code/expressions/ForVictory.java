package expressions;

public class ForVictory {

	public static void main(String[] args) {
		// i 4
		//  initialization     test             update          
		/*int x = 0;
		for(int i = 1 ;       i <= 11111117  ;  i++) {
			x++;
			//System.out.println("This is a for loop!"); // body
		}*/
		// x++; x = x + 1;
		//System.out.println("Done!\nx is " + x);
		//System.out.println(i);
		
		
		// 1 2 3 4 5 ... 9 10
		/*
		for(int i = 1;  i <= 10; i++) {
			
			System.out.println(i + " squared is:\t" +  i * i);
		}
		
		
		for(int i = 5; i <= 100; i+=5) {
			System.out.println(i);
		}
		
		System.out.println(Integer.MAX_VALUE + 1);
		
		for(int count  = 10 ; count > 0 ;  count++) {
			//System.out.println("T - minus: " + count);
		}
		System.out.println("Blastoff!");
		
		*/
		for(int i = 1; i <= 5 ; i++) {
			System.out.print("Line " + i + "\t");
			
			for(int j = 1; j <= 10; j++) {
				System.out.print(j);
			}
			System.out.println("");
		
		}

		// i -> 3
		// j -> 
		// *
		// **
		// ***
		//
		
		for(int  i = 1; i <= 5;i++) {
			for(int j = 1; j <= (5 - i); j++) {
				System.out.print(".");
			}
			System.out.print(i);
			
			for(int j = 1; j <= i - 1; j++ ) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		/*
		for (int count = 1; count <= 5; count++) {
		    System.out.print( count *5  -3   + " ");
		}
		System.out.println("\n4 7 10 13 16");
		*/
		
	}

}
