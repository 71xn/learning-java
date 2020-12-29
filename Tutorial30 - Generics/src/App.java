import java.util.ArrayList;
import java.util.HashMap;

// Tutorial 30
// Generics

// A Generic class is one that can work with many different objects, thus it is generic


public class App {
	public static void main(String[] args) {
		
		//////////////////////////////// Before Java 5 ////////////////////////////////
		ArrayList list = new ArrayList<>();
		
		list.add("apple");
		list.add("Banana");
		list.add("orange");
		
		// We have to downcast the object type to a String
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		
		//////////////////////////////// Modern Style ////////////////////////////////
		
		// ArrayList is a parameterised class, or a generic one, meaning that is can be used with different types of objects
		
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(0);
		System.out.println(animal);
		
		
		/////////////////////// More then one type of argument ////////////////////////
		
		HashMap<Integer, String> map = new HashMap<>();
		
		
	}
}
