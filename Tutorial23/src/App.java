
// Tutorial 23, Interfaces

public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		person1.showInfo();
		mach1.showInfo();
		
		// We are creating a machine object using the interface, so it will only have the selected methods listed in the interface available to it
		Info info1 = new Machine();  
		info1.showInfo();
		
		Info info2 = person1; // Pointing the info2 object to the same thing that the person1 object points to
		info2.showInfo();
		
	}
}
