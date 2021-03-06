
// Tutorial 16
// Method Parameters

class Robot {
	// String text is the method parameter, it means that for the function to run it needs an input of type String
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}


public class App {
	
	public static void main(String[] args) {
		
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam.");
		sam.jump(7);
		sam.move("West", 12.2);
		
		String greeting = "Hello there.";
		
		sam.speak(greeting); // We can also pass variables and objects as method arguments, as long as it is what the method is expecting
		
		int value = 14;
		sam.jump(value);
		
	}
	
}
