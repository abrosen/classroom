package params;

public class Parameters {

	public static void printThis() {
		System.out.println("T");
		System.out.println("H");
		System.out.println("I");
		System.out.println("S");
	}
	
	public static void printTwice() {
		printThis();
		printThis();
	}
	
	
	public static void printWhatISayTwice(String message) {
		System.out.println(message);
		System.out.println(message);
	}
	
	
	public static void printWhatISayLots(String message, int times) {
		for(int i = 1; i <= times; i++) {
			System.out.println(message);
		}		
		
	}
	
	public static void main(String[] args) {
		printWhatISayLots("hill", 50);

	}

}
