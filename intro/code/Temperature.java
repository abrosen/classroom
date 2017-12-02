import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Please enter the number of temps you want");
		num = Integer.parseInt(keyboard.nextLine());
		double[] temperatures = new double[num];
		
		System.out.println("Please enter a temperature");
		String input = "";
		double sum = 0;

		
		for(int i = 0 ; i < num; i++) {
			input = keyboard.nextLine();
			double temp = Double.parseDouble(input);
			temperatures[i]  = temp;
			sum+=temp;

		}
		
		double maxTemp = temperatures[0];
		for(int i = 0; i< temperatures.length; i++) {
			if(temperatures[i] > maxTemp) {
				maxTemp = temperatures[i];
			}
		}
		System.out.println(maxTemp);
		
		
		System.out.println(sum/num);
		

	}

}
