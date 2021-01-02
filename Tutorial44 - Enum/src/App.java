
// Tutorial 44  
// Enum

public class App {
	
	public static void main(String[] args) {
		
		Animal animal = Animal.cat;
		
		switch (animal) {
		case cat:
			System.out.println("cat");
			break;
		case dog:
			System.out.println("dog");
			break;
		case mouse:
			System.out.println("mouse");
			break;
		default:
			break;
			
		}
		
		System.out.println(Animal.dog); // Gets our overridden toString method
		
		System.out.println("Enum name as a string: " + Animal.dog.name()); // Returns the name of the enumerated constant
		
		System.out.println(Animal.dog.getClass());
		
		// Returns true if Object is an instance of a specified class or enum
		System.out.println(Animal.dog instanceof Animal);
		
		System.out.println(Animal.dog instanceof Enum);
		
		System.out.println(Animal.mouse.getName());
		
		
	}
		
		
}

