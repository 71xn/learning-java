import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Collections 4 
 * Sorted Maps
 */

// A hash is a value that represents the code that is used stores things and identify objects

public class App {
	
	public App() {
		
		// This is unordered
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// This is sorted
		// Has a linked list connecting entries, the entries stay in the same order they were entered in
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		// Trees sort values in natural order (ascending / alphabetical)
		// 
		TreeMap<Integer, String> treeHashMap = new TreeMap<>();
		
		// Unsorted
		testMap(hashMap);
		
		// In the order they were put in
		testMap(linkedHashMap);
		
		// Sorted
		testMap(treeHashMap);
		
	}
	
	// We can use the Map interface to allow the method to accept all types of maps
	public void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "dog");
		map.put(8, "cat");
		map.put(11, "mouse");
		map.put(16, "bird");
		map.put(2, "horse");
		map.put(3, "fish");
		
		// keySet returns a set collection which is like a list of all the keys in the hashMap
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main(String[] args) {
		new App();
	}
	
}
