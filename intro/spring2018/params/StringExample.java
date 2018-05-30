package params;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   indexes      012345678
		String course  = "CIS 1068 - Rosen's section for this class";
		String lowercase =  course.toLowerCase();
		int length = course.length();
		System.out.println(length);
		System.out.println(course.substring(2));
		
		char firstChar = course.charAt(0);
		char secondChar = course.charAt(1);
		char lastChar = course.charAt(course.length() -1);
		
		
		
		System.out.println(firstChar);
		System.out.println(lastChar);

		// i =1 ; i <= num  -> [1 , num]   num
		// i = 0; i < num  ->  [0, num)    num
		for( int i = 0;   i < course.length() ; i++) {
			char ithChar = course.charAt(i);
			System.out.println( ithChar);
		}
	}

}
