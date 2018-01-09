
public class Parameters {

	public static void line(int num) {
		
		for(int i = 1 ; i <= num; i++) {
			System.out.print("*");	
		}
		System.out.println();
	
	}
	
	public static void sayAddition(int x, double y) {
		
		System.out.println( x + y);
	}
	
	public static void box(int width, int height) {
		line(width);
		for(int i = 1; i <= height -2; i++) {
			
			System.out.print("*");
			for(int j = 1; j <=  width -2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		
		line(width);
	}
	
	public static void main(String[] args) {
		System.out.println( MathExample.add(5, 10) );
	}

}
