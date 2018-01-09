
public class HowToStringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "";
		long start = System.currentTimeMillis();
		for(int i = 0 ; i <10000; i++) {
			System.out.print("");
			a += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		String b = "";
		StringBuilder builder = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 0 ; i <1000000; i++) {
			System.out.print("");
			builder.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
	}

}
