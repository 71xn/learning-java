import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Collections 6
 * Objects in Maps and Sets
 * 
 * If you want to use a custom Obect as a key or a value in a set you need to implement the hashCode and equals method in your Objects class
 */

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class App {

	public App() {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);

		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

		Set<String> set = new LinkedHashSet<String>();

		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("cat");

		System.out.println(set);
		
		// Using our own Objects as keys and values
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> map1 = new LinkedHashMap<Person, Integer>();
		
		map1.put(p1, 1);
		map1.put(p2, 2);
		map1.put(p3, 3);
		map1.put(p4, 1);
		
		Set<Person> set1 = new LinkedHashSet<Person>();
		
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		
		// Both the set and the map have two sues in them
		// Sets and maps can't tell if two objects are the same
		// To fix this wee need to add hash code and equals methods to the Person class
		for (Person person : set1) {
			System.out.println(person);
		}
		
		
	}

	public static void main(String[] args) {
		new App();
	}
}
