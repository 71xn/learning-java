import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * Collections 5
 * Sets
 */

// A set is a collection that only stores unique items

public class App {

	public App() {

		// HashSet does not retain any order
		HashSet<String> set = new HashSet<String>();

		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("snake");
		set.add("bear");

		// Adding duplicate items does nothing
		// Good for sorting out duplicate items
		set.add("mouse");

		System.out.println("Outputting Sets: ");
		System.out.println(set);

		// LinkedHashSet remembers the order you added items in
		LinkedHashSet<String> set1 = new LinkedHashSet<>();

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		System.out.println(set1);

		// TreeSet sorts in natural order
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("dog");
		treeSet.add("cat");
		treeSet.add("mouse");
		treeSet.add("snake");
		treeSet.add("bear");

		System.out.println(treeSet);

		System.out.println("Iteration with sets: ");
		// Iteration through a set
		for (String element : set) {
			System.out.println(element);
		}

		System.out.println("Checking if a set contains an element: ");
		// Does set contain a given item
		System.out.println(set.contains("test"));
		System.out.println(set.contains("bear"));

		System.out.println("Checking if a set is empty:");
		System.out.println(set.isEmpty());

		// Intersection

		TreeSet<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		// Finding common elements
		HashSet<String> intersection = new HashSet<String>(set1); // By passing set1 to the constructor we are making a copy of it
		
		// This will make the intersection set only contain all the elements that are only in set1 and then set2
		intersection.retainAll(set2);
		
		System.out.println(intersection); // Prints only the common elements
		
		
		// Difference
		
		HashSet<String> difference = new HashSet<String>(set1);
		
		// Removes all common elements between the two sets and you are left with unique elements from set1
		difference.removeAll(set2);
		
		System.out.println(difference);
		

	}

	public static void main(String[] args) {
		new App();
	}

}
