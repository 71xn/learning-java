import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects . . .");
		
		try (FileOutputStream fs = new FileOutputStream("people.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
			
			Person person = new Person(55, "Bob");
			Person.setCount(88);
			os.writeObject(person);
			
			System.out.println("Done!");
			
		} catch (FileNotFoundException e){
			System.out.println("File could not be found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not write to file!");
			e.printStackTrace();
		}
		
	}
}
