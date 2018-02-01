package params;

public class FiguresAndParameters {

	
	/*            i     dots    
	 * ....1      1      4     5 - 1
	 * ...2       2      3     5 - 2                
	 * ..3        3      2     5 - 3             
	 * .4         4      1     5 - 4            
	 * 5          5      0     5 - 5         
	 
	 *
	 *  .....1
	 *  ....2
	 *  ...3
	 *  ..4
	 *  .5
	 *  6
	 *  
	 *  
	 *            i     dots    
	 * ......1      1      6     7 - 1
	 * .....2       2      5     7 - 2                
	 * ....3        3      4     7 - 3             
	 * ...4         4      3     7 - 4            
	 * ..5          5      2     5 - 5  
	 * .6           6      1
	 * 7            7      0
	 */
	public static void printDotsAndNums(int n) {
		for(int i = 1 ; i <= n ; i++ ) {
			for(int dots = n - i ; dots > 0; dots--) {
				System.out.print(".");
			}
			System.out.println(i);
		}
		
	}
	
	/*
	 * 
		_   _   _   _   _      --
		 |_| |_| |_| |_| |_|     | --- This is one snake that has a length of 5
		_   _   _   _   _      --
		 |_| |_| |_| |_| |_|
		_   _   _   _   _   
		 |_| |_| |_| |_| |_|  
		 
		 
		_   
		 |_|                ------           
		_   _                     |
		 |_| |_|                  |    
		_   _   _                 | ------ Problem 2 : print out sneks of varying sizes                
		 |_| |_| |_|              |        
		_   _   _   _             | 
		 |_| |_| |_| |_|    ------             
	 */
	
	public static void printSomeSnakes(int numberOfSnakes) {
		
		for(int i = 1 ; i <= numberOfSnakes; i++) {
			printSnake(i);
		}
	}
	
	
	public static void printSnake(int length) {
		for(int i = 1; i <= length; i++ ) {
			System.out.print("_   ");
		}
		System.out.println();
		for(int i = 1; i <= length; i++ ) {
			System.out.print(" |_|");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSomeSnakes(50);
	}

}
