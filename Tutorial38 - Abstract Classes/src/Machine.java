
// The abstract keyword means that no Objects of this specific class can be made, it is to be used as a parent class only

// Compared to an interface it allows you to initialise methods that have to be used or overridden by subclasses
// Classes can implement many interfaces but can have only one parent class
// You can't put code in an interface, all methods are defined but you cannot initialise any of them, unlike an abstract class 



public abstract class Machine {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Exactly like an interface, means the methods have to be implemented in all subclasses
	public abstract void start(); 
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void run() {
		start();
		doStuff();
		shutdown();
	}
}
