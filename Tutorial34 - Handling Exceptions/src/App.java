import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Tutorial 34 
// Handling Exceptions

// Exceptions are just objects derived from an exceptions class

public class App {
	
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			// For this to work we need a try catch, to catch exceptions
			FileReader fr = new FileReader(file);
			
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // Prints the exception stack trace
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
