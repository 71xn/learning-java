
// The extends keyword means that car is a child class of Machine, Machine is the parent class
// This also means that Car inherits all of Machines methods

public class Car extends Machine {
	public void wipeWindShield() {
		System.out.println("Wiping Windshield");
	}
	
	// You can override methods from parent classes by declaring them again in a child class
	@Override
	public void start() {
		System.out.println("Car started.");
	}
}
