package params;

public class FromSlides {

	
	public static void line(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

	
	
	/*  5  7
	 *  *****
	 *  *   *
	 *  *   *
	 *  *   *
	 *  *   *
	 *  *   *
	 *  *****
	 */
	
	public static void box(int width, int height) {
        line(width);
        
        for (int line = 1; line <= height - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= width - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        line(width);
    }

	
	public static void tryToModify(int x ) {
		x = x + 1;
		System.out.println("Method x:"  + x);
	}
	
	
	
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("Main x:"  + x);
		tryToModify(x);
		System.out.println("Main x:"  + x);
		
	}

}
