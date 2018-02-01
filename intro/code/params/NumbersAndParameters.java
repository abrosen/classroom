package params;

public class NumbersAndParameters {

	public static void printSum(int x, int y) {
		int sum = x + y;
		System.out.println("The sum is " + sum);
	}
	
	// this method prints all integers from 1 to n inclusive
	public static void printCountTo(int n) {
		for(int i = 1; i <= n ; i++) {
			System.out.println(i);
		}
	}
	
	// this method prints all integers from 1 to n inclusive, by adding x each time	
	public static void countByX(int n, int x) {
		for(int i = 1; i <= n ; i+=x ) {
			System.out.println(i);
		}
	}
	
	
	/*
	 *  Write a method given as parameters a thing which travels for time seconds at
		velocity meters per second, and accelerates at acceleration, print out how far
		that thing has traveled at each second from second 0 to second time.
		The equation used for this is
		x = v*t + (1/2)*a*t^2
		Where x is the distance traveled, v is the velocity, and a the acceleration.
	 */

	public static void kinematics(double time, double velocity, double acceleration) {
		
		for(double t = 0; t <= time; t++) {
			double distance =  velocity * t+ (0.5) * acceleration * t * t;
			System.out.println(distance);
		}
	}
	
	
	
	public static void main(String[] args) {
		kinematics(10, 60, 1);
	}

}
