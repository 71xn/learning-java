
// Tutorial 43
// Inner Classes

// Anonymous Classes are a type of Inner Class

public class App {
	
	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		// No-one every does this
		// Allows us to have a Brain object of Robots inner class Brain
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
	}
	
}
