
public class MathExample {

	
	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static double slope(int x1, int y1, int x2, int y2) {
	    double dy = y2 - y1;
	    double dx = x2 - x1;
	    double result = dy / dx;
	    return result;
	}

	
	
	public static void main(String[] args) {
		
		
		double d = slope(0, 0, 5,5 );
		System.out.println(d);
	}

}
