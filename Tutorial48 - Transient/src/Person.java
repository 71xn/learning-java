import java.io.Serializable;

// Tutorial 48
// The transient keyword

public class Person implements Serializable {

	private static final long serialVersionUID = 4801633306273802062L;

	// The transient keyword prevents a field from being serialized
	private transient int id;
	// When serialized it defaults to default value of 0

	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two-Argument Constructor");
	}
	
	public Person() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", count=" + count + "]";
	}

	// Static fields under transient serializing
	// Static means every object has the same value, no point in serializing each value
	private static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

}
