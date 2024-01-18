
public class Logic {

	public static void main(String[] args) {
		
		
		

		
		//  <=      !  not 
		//  >=      &&  and 
		//  <       ||   or
		//  >
		//  ==
		//  !=
		boolean b = false;
		
		
		int x = 10;
		
		
		//  0 1 2 3 4 5 6 7 8 9 
		
		//  0 <= x < 10
		if( (0 <= x   &&  x < 10)   || x % 2  == 0 ) {
			System.out.println("Truthiness");
		} else {
			System.out.println("Lies from beyond the outer realms!");
		}
		
		
	}

}
