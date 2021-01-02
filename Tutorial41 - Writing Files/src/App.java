import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Tutorial 41
// Writing Files

public class App {
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		// Very succinct compared to the way in tutorial 39
		
		// Passes a file reader object directly to the BuffferedReader
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
				br.write("Line 1\n");
				br.write("Line 2\n");
				br.write("Line 3");
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		
	}
}
