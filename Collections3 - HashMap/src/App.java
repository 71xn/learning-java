import java.util.HashMap;
import java.util.Map;

/*
 * Collections 3
 * HashMap
 */

public class App {

	public App() {
		
		/*
		 * HashMaps store pairs, a key and a value, you can store any kind of objects for keys and values
		 * They are like a lookup table
		 * Custom objects have to have the hash code and equals methods to be used as keys in a map
		 */
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Adding an element
		// Creates a lookup table to lookup strings with numbers, lookup values with keys
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		// Getting values, pass the key
		String text = map.get(6);
		System.out.println(text);
		
		// This overrides the first value for the key 6, you can have duplicate values but not duplicate keys
		map.put(6, "Hello!");
		text = map.get(6);
		System.out.println(text);
		
		// Iteration over a HashMap w/ a for each loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			// HashMap is not sorted in any way
			System.out.println(entry);
			
			// Keys and values can be retrieved like this:
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
		
	}

	public static void main(String[] args) {
		new App();
	}

}
