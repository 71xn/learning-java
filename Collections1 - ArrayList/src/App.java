import java.util.ArrayList;

// Collections 1
// ArrayList

// ArrayList is an expandable array that can old all types of Java Objects

public class App {

	public App() {
		ArrayList<Integer> number = new ArrayList<Integer>(); // A size can be specified in the ()
		// You need to use the type class, not the primitive type, Integer, not int

		// Adding values
		number.add(10);
		number.add(100);
		number.add(40);

		// Retrieving values
		System.out.println(number.get(0));

		// Iteration over ArrayList
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

		// Removing elements from the end; very FAST
		number.remove(number.size() - 1);

		// Removing elements from the beginning; this is very SLOW
		number.remove(0);

		// Iteration with enhanced for loop
		for (Integer value : number) {
			System.out.println(value);
		}

	}

	public static void main(String[] args) {
		new App();
	}

}
