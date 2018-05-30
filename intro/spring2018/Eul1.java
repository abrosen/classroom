
public class Eul1 {

	public static int eul1() {
		int sum = 0;
		for(int i = 1; i< 1000; i++) {
			if(i % 3 ==0 || i % 5 ==0) {

				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eul1());
	}

}
