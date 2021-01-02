import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		// Very succinct compared to the way in tutorial 39
		
		// Passes a file reader object directly to the BuffferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cant fine file: " + file.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		
	}
	
}
