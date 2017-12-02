import java.util.Scanner;

public class ObjectDemo {
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		String a = "done";
		String b = "DONE".toLowerCase();
		System.out.println(a.equals(b));
		
		while(!input.equals("done")) {
			System.out.println(input);
			input = scanner.nextLine();
		}
		
	}

}
