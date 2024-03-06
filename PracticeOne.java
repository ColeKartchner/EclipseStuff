/**
 * Solutions to Java Practice exercises
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class PracticeOne {

	// Problem #2
	/**
	 * Outputs all the numbers from 1 to value
	 * that are evenly divisible by 3
	 */
	public static void evenlyDivisible(int value) {
		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// Problem #3
	
	/**
	 * Outputs three random famous computer scientists
	 */
	public static void famous(String[] computerScientists) {
		Random rnd = new Random();
		int index;
		
		System.out.println("Three famous computer scientists are");
		
		for (int i = 0; i < 3; i++) {
			index = rnd.nextInt(computerScientists.length);
			
			System.out.println(computerScientists[index]);
		}
	}

	public static void main(String[] args) {
		// Problem #1

		Scanner fromUser = new Scanner(System.in);

		System.out.print("Enter an integer value: ");
		int value = fromUser.nextInt();

		// loop from 1 to value entered
		// and output all numbers that are 
		// evenly divisible by 3
		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();

		// Problem #2

		System.out.print("Enter an integer value: ");
		value = fromUser.nextInt();
		evenlyDivisible(value);
		
		// Problem #3
		
		String[] famousCSFolks = {
	            "Ada Lovelace",
	            "Grace Hopper",
	            "Joan Clarke",
	            "Jean Jennings Bartik",
	            "Anita Borg",
	            "Frances Elizabeth Allen",
	            "Lois Haibt",
	            "Margaret Hamilton"
	        };
		
		famous(famousCSFolks);
	}

}
