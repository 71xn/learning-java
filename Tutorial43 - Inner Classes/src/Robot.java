
public class Robot {
	private int id;

	// Nested Classes
	// Used for grouping parts of a program
	public class Brain {
		// This class has access to the instance data of the Robot class
		public void think() {
			System.out.println("Robot " + id + " is thinking!");
		}
	}
	
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting Robot: " + id);
		Brain brain = new Brain();
		brain.think();
	}
	
}
