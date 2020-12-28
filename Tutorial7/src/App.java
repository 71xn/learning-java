// Tutorial 7
// Getting User Input w/ Scanner

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Creating an instance (object) of the scanner class, with a scanner varibale to refer to our object
		
		// Strings
	
		System.out.println("Enter a line of text: ");
		String line = scanner.nextLine(); // Grabs the first line of text entered into the console and stores it in `line`
		System.out.println("You entered: " + line);
		
		// Numbers, can be used with all number types, int, double, float etc.
		System.out.println("Please enter a number: ");
		int num = scanner.nextInt();
		System.out.println("Your number was: " + num);
	
		scanner.close(); // Closes the scanner object, not necessary, makes eclipse happy
		
		
	}
}
