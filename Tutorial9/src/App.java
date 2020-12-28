import java.util.Scanner;

// Tutorial 9
// Switch and switch case

public class App {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = scanner.nextLine();
		
		
		// Switch can only be used to check certain variables
		
		switch (text) {
			case "start":
				System.out.println("Machine started!");
				break;
			case "stop":
				System.out.println("Machine started!");
				break;
			default: // This is executed if none of the above case's are true
				System.out.println("Command not recognised");
		}	
	}
}
