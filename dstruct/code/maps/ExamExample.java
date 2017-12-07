package maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class ExamExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scanner =  new Scanner(new File("times.txt"));
		Map<String, Double> loginSums = new HashMap<>();
		Map<String, Integer> numSessions = new HashMap<>();
	
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] parts  = line.split(" ");
			String user =  parts[0];
			double time = Double.parseDouble(parts[1]);
			if(!loginSums.containsKey(user)) {
				loginSums.put(user, 0.0);
				numSessions.put(user, 0);
			}
			double currentTime = loginSums.get(user);			
			int currentSessions = numSessions.get(user);			
			
			loginSums.put(user, currentTime + time);
			numSessions.put(user, currentSessions +1);
		}
		
		for(String user : loginSums.keySet()) {
			loginSums.put(user,   loginSums.get(user)/ numSessions.get(user));
		}
		
		System.out.println(loginSums);
		
		
		
	}

}
