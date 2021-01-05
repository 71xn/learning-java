
// Tutorial 19
// Static and Final

class Thing {
	// This is a declaration of a final variable, or a constant that cannot be changed, just like the PI from the Math class
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	// Static member variables belong to the class and each object does not have its own individual copy
	public static String description;
	
	public static int count = 0; // As count is static, there can only be one, and it is shared with the whole class, e.g when count is incremented, it will be incremented for all objects
	
	public int id; // Each object will have a unique ID
	
	public Thing() { // This is run every time a new object is created
		id = count;
		count++;
	}
	
	// Non-Static methods can access static variables
	public void showName() {
		System.out.println("Object ID: " + id + ", " + description + ": " + name);
	}
	
	// You dont have to have a static method to reference static variables, but you cannot referencer non-static types from within them
	public static void showInfo() {
		System.out.println(description);
		// Wont work because name is not static, System.out.println(name);
	}
}

public class App {
	public static void main(String[] args) {
		
		// Accessed using class name, followed by the static variable 
		Thing.description = "I am a thing";
		
		//System.out.println(Thing.description);
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		// As the show info method is Static, we reference it by using the class name, rather then the object name
		Thing.showInfo();
		
		// In this case, the instance variable PI is static, so we reference it by calling the math class
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
	}
}
