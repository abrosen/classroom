
public class MethodExample 
{
	public static void printa() {
		
	}
	//case sensitive 
	public static void printA() {
		
	}
	public static void printSquare() {
		System.out.println("******");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("******");
		
	}
	
	public static void printDiamond() {
		printTop();
		printBottom();
	}
	
	public static void printTop() {
		System.out.println("  /\\  ");
		System.out.println(" /  \\ ");
		System.out.println("/    \\");
		
	}
	
	public static void printBottom() {

		System.out.println("\\    /");
		System.out.println(" \\  / ");
		System.out.println("  \\/  ");
	}
	
	public static void printRocket() {
		printTop();
		printSquare();
		printSquare();
		printSquare();
		printSquare();
		printSquare();
		printTop();
	}
	
	public static void main(String[] args) 
	{
		printSquare();
		System.out.println("The dog says \"woof\"  ");
		System.out.println("Print out a slash by using two slashes \\ \\\\");
		
		// This is a comment
		// \n creates a new line
		
		/*  this is a multiline comment
		 * dasfsdakjflksadjf
		dfsadfs
		
		fdsalkfdsa;lfsd  / *
		// */
		
		String s = "hello";
		System.out.println("I\nwant\neach\nword\non\nit's\nown\nline\n");
		/*
		printSquare();
		printSquare();
		printSquare();
		printSquare();
		printSquare();
		printDiamond();
		*/
		printRocket();
	
	}
	


}
