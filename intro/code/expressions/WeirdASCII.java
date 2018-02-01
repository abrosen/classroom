package expressions;

public class WeirdASCII {

	public static void drawLine() {
		System.out.print("#");
		for(int i =1; i <= 16; i++) {
			System.out.print("=");
		}
		System.out.println("#");
	}
	
	/*
	|      <><>      |
	|    <>....<>    |
	|  <>........<>  |
	|<>............<>|
	 */
	
	public static void drawTop() {
		for(int i = 1; i <= 4; i++ ) {
			System.out.print("|");
			
			for(int spaces = 1; spaces <= 8  - 2*i; spaces++ ) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for(int dots = 1; dots <= 0 + 4*(i-1) ; dots++ ) {
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces = 1; spaces <=8 - 2*i ; spaces++ ) {
				System.out.print(" ");
			}
			
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	
	public static void drawBottom() {
		for(int i = 1; i <= 4; i++ ) {
			System.out.print("|");
			
			for(int spaces = 1; spaces <= 0 + (2*i)  -2 ; spaces++ ) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for(int dots = 1; dots <= 12 - 4*(i -1) ; dots++ ) {
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces = 1; spaces <=0 + (2*i)  -2 ; spaces++ ) {
				System.out.print(" ");
			}
			
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		drawLine();
		drawTop();
		drawBottom();
		drawLine();

	}

}
