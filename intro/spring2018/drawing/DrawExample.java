package drawing;

public class DrawExample {

	public static void printHello() {
		System.out.println("Hello!");
		System.out.println("How are you today?");
		
	}
	
	public static void drawTop() { 
		System.out.println("   /\\   ");
		System.out.println("  /  \\  ");
		System.out.println(" /    \\");
		
	}
	
	public static void drawTopTube() { 
		System.out.println("|  /\\  |");
		System.out.println("| /  \\ |");
		System.out.println("|/    \\|");
		
	}
	public static void drawV() {
		System.out.println(" \\    /");
		System.out.println("  \\  / ");
		System.out.println("   \\/  ");
	}
	public static void drawVTube() {
		System.out.println("|\\    /|");
		System.out.println("| \\  / |");
		System.out.println("|  \\/  |");
	}
	
	public static void drawDiamond() {
		drawTop();
		drawV();
	}
	public static void drawDiamondTube() {
		drawTopTube();
		drawVTube();
	}
	
	public static void drawX() {
		drawV();
		drawTop();
	}
	public static void drawXTube() {
		drawVTube();
		drawTopTube();
	}
	
	public static void drawDivider() {
		System.out.println("========");
	}
	
	public static void drawBox() { 
		System.out.println("------");
		System.out.println("|    |");
		System.out.println("|    |");
		System.out.println("______");
		
	}
	
	public static void drawLander() {
		drawBox();
		drawTop();
	}
	
	public static void drawExhaust() {
		System.out.println("   ||   ");
		System.out.println("   ||   ");
		System.out.println("   ||   ");
		System.out.println("   ||   ");
		
	}
	
	public static void main(String[] args) {
		drawTop();
		drawDivider();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawXTube();
		drawDivider();
		drawDiamondTube();
		drawDivider();
		drawTop();
		drawExhaust();
	}

}
