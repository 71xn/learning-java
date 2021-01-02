import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Tutorial 39
// Reading Files with FileReader

public class App {
	
	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // This is always executed regardless of the exceptions 
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
