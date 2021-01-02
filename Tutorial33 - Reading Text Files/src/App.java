import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Tutorial 33 
// Reading Text Files

public class App {
	
	public static void main(String[] args) {
		String fileName = "C:/Users/User/text.txt";
		
		File textFile = new File(fileName);
		
		try {
			Scanner in = new Scanner(textFile);
			
			int value = in.nextInt();
			System.out.println("Read Value: " + value);
			
			 while (in.hasNextLine()) {
				 String line = in.nextLine();
				 System.out.println(line);
			 }
			
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
}
