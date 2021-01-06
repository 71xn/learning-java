import java.util.Iterator;
import java.util.LinkedList;

/*
 * Collections 10
 * Using Iterators
 */

public class App {
	
	public App() {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		// Modern iteration, post Java 5 //
		
		for (String string : animals) {
			System.out.println(string);
		}
		
		// Pre Java 5 //
		// Used if you wan to remove items from a list whilst iterating through it
		
		Iterator<String> it = animals.iterator(); // Returns an Object of type Iterator that can point at eahc item in a list in turn
		
		String animal = it.next();
		System.out.println(animal);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		new App();
	}
	
}
