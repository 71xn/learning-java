import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading Objects . . .");
		
		try (FileInputStream fi = new FileInputStream("people.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {
			
			Person person = (Person) os.readObject();
			System.out.println(person);
			
			// When we de-serialize count it will default to 0 as it is static and static fields are unable to be serialized
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
