import World.Plant;

// Tutorial 25
// Public, Private, Protected

/*
 * private -- only within the same class
 * public -- from anywhere
 * protected -- subclasses and same package
 * no modifier -- same package only
 */


public class App {
	
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		// Public
		// as name is a public instance variable in the plant class, it can be accessed from anywhere
		System.out.println(plant.name); 
		// and changed from anywhere
		plant.name = "Bob";
		
		
		// Public final
		// Can be accessed from anywhere but not changed
		System.out.println(plant.ID);
		
		// Private
		// Private can be accessed from within the class but not outside of the class, even by objects of that same class
		// This wont work because type is private
		//System.out.println(plant.type);
		
		
		
		
	}
	
}
