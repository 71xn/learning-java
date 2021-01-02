import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects . . .");

		Person[] people = {new Person(1, "Bob"), new Person(5, "Bill"), new Person(11, "John")};
		// Arrays can be Serialized and de-Serialized just like normal objects
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try (FileOutputStream fs = new FileOutputStream("people.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
			
			os.writeObject(people);
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			
			for (Person person : peopleList) {
				os.writeObject(person);
			}
			
			os.close();
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
