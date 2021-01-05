package World;

public class Plant {
	// If something is declared as public, it can be accessed from anywhere
	// Bad practice
	public String name;
	
	//Acceptable Practice
	// Public constants are fine
	public final static int ID = 8;
	
	private String type;
	
	public String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		
		// private can be accessed from within the class but not outside of the class, even by objects of that same class
		this.type = "plant";
		
		// protected can be accessed in the class, and within sub-classes and within the same package
		this.size = "medium";
	}
	
	
}
