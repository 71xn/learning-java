
// Tutorial 49 
// Passing by Value

/*
 * In java there is only passing by value, rather then passing my reference like in other languages
 */

public class App {
	public static void main(String[] args) {
		new App();
	}
	
	
	public App() {
	
		// Passing primitive types by value
		// ================================================================================
		show(7);
		
		// The scope of a variable is usually within the scope of the enclosing curly braces
		int fox = 7;
		show(fox);
		
		// Passing reference types by value
		// ================================================================================
		
		Person person = new Person("Bob");
		System.out.println(person);
		show(person);
	}
	
	// Your variables you pass to methods are always copies of the original value
	// This is what is called as passing by value
	public void show(int value) {
		System.out.println("Value is: " + value);
	}
	
	public void show(Person person) {
		System.out.println("Person is: " + person);
	}
	
}
