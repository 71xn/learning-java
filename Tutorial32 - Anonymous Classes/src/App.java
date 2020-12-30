
// Tutorial 32 
// Anonymous Classes

/*
 * Anonymous classes are a way of extending existing classes or, implementing an interface 
 */

class Machine {
	public void start() {
		System.out.println("Starting Machine . . .");
	}
}

interface Plant {
	public void grow();
}



public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			/* 
			 * Runs this code because we have created and anonymous class that extends the Machine class and overrides a method
			 * This is a subclass of machine
			 * The type of the object is some subclass of a machine
			 */
			@Override
			public void start() {
				System.out.println("Camera snapping!");
			}
		};
		
		machine1.start();
		
		Plant plant1 = new Plant() {
			// Here we are creating an object from an interface and implementing it's method by using an anonymous class
			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant growing!");
			}
		};
		
		plant1.grow();
		
	}
	
}
