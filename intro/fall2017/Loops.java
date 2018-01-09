
public class Loops {

	
	public static void puzzle() {
		int x = 5;
		
		for(int i =  1; i <= 5; i++) {
			
			int y = 5;
			
			for(int j = 1 ;  j <= 5 - i  ; j++) {
				
				System.out.print(".");
			}
			
			System.out.print(i);
			
			for(int j = 1 ;  j <= i -1; j++) {
				System.out.print(".");
			}
			
			
			System.out.println("");
		}
		
		
		
	}
	
	public static void nested() {
		int x = 4;
		for(int i = 1; i <=20; i++) {
		
			
			for(int j  = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public static void loopI() {
		
		for(int i = 1; i <= 100 ; i++ ) 
		{
			System.out.println(i  +  " squared = "  + (i*i) );
		}
	}
	
	public static void counterExpression() {
		int highestTemp = 5;
		
		for (int i = -3; i <= highestTemp / 2; i++) {
		    System.out.println((i * 1.8 + 32) + "  ");
		}

	}
	
	public static void countdown() {
		System.out.println("Counting down");
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Blastoff!!!");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		/*x++;
		x++;
		x--;
		x--;
		x--;
		System.out.println(x);  //1
		x += 5;   // equivalent to x = x +5;
		System.out.println(x);  
		*/
		/*
		int times = 7;
		for(int i = 0 ;  i < times; i = i + 1) {
			// do stuff
			System.out.println("abcdefg");
			
			
		}*/
		//loopI();
		//counterExpression();
		//countdown();
		
		//nested();
		puzzle();
		
	}

}
