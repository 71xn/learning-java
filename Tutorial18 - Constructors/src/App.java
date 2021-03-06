
// Tutorial 18
// Constructors

// Constructors are special methods that are run every time a new instance of a class is created

class Machine {
	
	// Constructors always have to have the same name as the class
	// They have no return type, void, String, double, boolean etc.
	// They are often used for initialisation of instance variables
	
	//You often want multiple constructors and this is like having different parameters for methods
	
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0); // Here we are calling a constructor inside the current class that accepts the given parameters
		System.out.println("Constructor Running!");
		name = "Arnie"; // Every object will have this initialisation and this name set
		
	}
	
	// Our second constructor with a parameter of type String
	public Machine(String name) {
		System.out.println("Second Constructor Running!");
		this.name = name;
	} 
	
	// Our third constructor
	public Machine(String name, int code) {
		System.out.println("Third Constructor Running!");
		this.name = name;
		this.code = code;
		System.out.println(this.name);
		System.out.println(this.code);
	}
	
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		new Machine(); // This creates a new object and thus invokes the constructor, this is like a call to a constructor
		
		Machine machine2 = new Machine("Berite");
		
		Machine machine3 = new Machine("Chalky", 7);
		
	}
}
