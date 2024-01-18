
public class Scope {

	public static final double PI = 3.14159;
	

	public static void printBorder() {
		System.out.print("#");
		for (int  i = 1; i <= 16; i++) {
			System.out.print("=");
		}
		
		System.out.println("#");
		
	}
	
	public static void printTop() {
		for(int i = 0; i < 4; i++) {
			System.out.print("|");
		
			//print out spaces
			for(int j = 0; j < 6 - (i*2); j++ ) {
				System.out.print(" ");
				
			}
			
			System.out.print("<>");
			//print out periods
			for(int j = 0; j < i*4 ; j++ ) {
				System.out.print(".");
				
			}
			
			System.out.print("<>");
			//print out spaces
			for(int j = 0; j < 6 - (i*2); j++ ) {
				System.out.print(" ");
				
			}
			
			System.out.print("|");
			System.out.println("");
		}
		
	}
	
	
	public static void printBottom() {
		for(int i = 0; i < 4; i++) {
			System.out.print("|");
		
			//print out spaces
			for(int j = 0; j < (i*2); j++ ) {
				System.out.print(" ");
				
			}
			
			System.out.print("<>");
			//print out periods
			for(int j = 0; j < 12 - i*4 ; j++ ) {
				System.out.print(".");
				
			}
			
			System.out.print("<>");
			//print out spaces
			for(int j = 0; j < (i*2); j++ ) {
				System.out.print(" ");
				
			}
			
			System.out.print("|");
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printBorder();
		printTop();
		printBottom();
		printBorder();
	}

}
