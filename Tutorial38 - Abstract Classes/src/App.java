
// Tutorial 38
// Abstract Classes

// Useful when want to start creating a class hierarchy but the base class is not able to do anything itself but acts like a base for other classes
// They can be used to implement functionality that will be used by multiple subclasses

public class App {
	
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		// No purpose in having a Machine object as it is the base class that implements the functionality for the Camera and the Car class
		// Machine machine1 = new Machine(); // Wont work as Machine is an abstract class
	}
	
}
