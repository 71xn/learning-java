import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections 7
 * Sorting Lists
 */

// To sort in something other then natural order you need to have a class that implements the Comparator interface
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}
	}
}

class AlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class App {

	public App() {

		/////////////////////////////////////// Sorting Strings /////////////////////////////////////// 
		
		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");

		// Collections sort method
		// Sorted in natural order, same as TreeMap and TreeSet

		// Now they are sorted by string length, according to our class
		Collections.sort(animals, new StringLengthComparator());

		for (String string : animals) {
			System.out.println(string);
		}

		// Alphabetical Order
		Collections.sort(animals, new AlphabeticalComparator());

		for (String string : animals) {
			System.out.println(string);
		}

		// Reverse Alphabetical Order
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String string : animals) {
			System.out.println(string);
		}

		/////////////////////////////////////// Sorting Numbers ///////////////////////////////////////

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		// You can just use an anonymous class instead of making a new class, descending
		// value
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		/////////////////////////////////////// Sorting arbitrary objects ///////////////////////////////////////
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));
		
		// You cannot use the default sort method from Collections to sort arbitrary Objects, they dont have any natural order, you have to supply a comparator
		
		Collections.sort(people, new Comparator<Person>() { // Sorts in order of Id

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		for (Person person : people) {
			System.out.println(person);
		}
		
	
	}

	public static void main(String[] args) {
		new App();
	}

}
