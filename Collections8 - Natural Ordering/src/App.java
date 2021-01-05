import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Collections 8
 * Natural Ordering
 */

// To give an object a natural order we need to implement the Comparable interface 

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {
		// Sorting by alphabetical
		//return this.name.compareTo(person.name); // Comparing Strings with the compareTo String method
		
		// Sorting by name length // Doesn't work if two names have the same length // Caused by a conflict between equals and comapreTo Methods
		if (this.name.length() > person.name.length()) {
			return 1;
		} else if (this.name.length() < person.name.length()) {
			return -1;
		} else {
			return this.name.compareTo(person.name); // This fixes the problem by comparing them if they have an equal length and doing an alphabetical sort instead
		}
	}
}

public class App {
	public App() {

		// Predefined Objects // Default Natural Order //

		// Unordered
		ArrayList<String> list = new ArrayList<String>();

		// Elements stored in natural order
		SortedSet<String> set = new TreeSet<String>();

		addElements(list);
		addElements(set);
		showElements(list);
		System.out.println();
		showElements(set);
		System.out.println();

		// Because strings have a natural order defined, we can use the Collections
		// class to sort them
		Collections.sort(list);
		showElements(list);

		// User Defined Objects // No Default Natural Order //

		ArrayList<Person> list1 = new ArrayList<Person>();
		SortedSet<Person> set1 = new TreeSet<Person>(); // Will give error as the Person Object doesn't have a natural
														// order defined

		addPersonElements(list1);
		addPersonElements(set1);

		showPersonElements(list1);
		System.out.println();
		showPersonElements(set1);
		System.out.println("Sorting Works!");

		Collections.sort(list1); // Now we can sort the elements because we have declared a natural order
		showPersonElements(list1);

	}

	// Here we can use the collection interface to refer too any type of collection
	// Object
	private void addElements(Collection<String> col) {
		col.add("Joe");
		col.add("Sue");
		col.add("Bill");
		col.add("Mike");
		col.add("Bob");

	}

	private void showElements(Collection<String> col) {
		for (String string : col) {
			System.out.println(string);
		}
	}

	private void addPersonElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Bill"));
		col.add(new Person("Mike"));
		col.add(new Person("Bob"));
	}

	private void showPersonElements(Collection<Person> col) {
		for (Person person : col) {
			System.out.println(person);
		}
	}

	public static void main(String[] args) {
		new App();
	}
}
