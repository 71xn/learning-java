import java.util.Scanner;

// Tutorial 8
// Do While loops, multi-line comments, variable scope

public class App {
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");

		int value = scanner.nextInt();
		
		
		// While loops
		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt(); // This assignment of value cannot have a int in front of it because the variable value has already been declared in the current scope
		}
		
		// Do While Loops
		// Checking after each run of the loop
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
			// If value was declared inside the loop we could not use it as the scope of the variable would be inside the loop.
		} while (value != 5);
		
		
		/**
		 * Multi-line comments!
		 * 
		 */
		
		scanner.close();
		
	}
	
}
