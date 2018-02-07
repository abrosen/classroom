package exercises;

public class ExerciseFeb5 {
	/*
-----1-----
----333----
---55555---
--7777777--
-999999999-
	 */
	
	public static void printProb1() {
	
		for(int lines = 1; lines <=5; lines ++ ) {
			
			for(int i = 1; i<=6 -(lines); i++) {
				System.out.print("-");
			}
			
			
			for(int num = 1; num <=  2*lines -1  ; num++) {
				System.out.print(2*lines -1);
			}
			
			
			for(int i = 1; i<=6 -(lines); i++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printProb1();
	}

}
