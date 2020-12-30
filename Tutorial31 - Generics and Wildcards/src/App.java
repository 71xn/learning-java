import java.util.ArrayList;

// Tutorial 31 
// Generics and Wildcards

// A wildcard is a ?, and it means of unknown type, it treats everything as Objects

// Generic classes are classes that can work with any type of Object

class Machine { // implicitly extends the Object class

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine starting . . .");
	}

}

class Camera extends Machine { // explicitly extends The Machine class

	@Override
	public String toString() {
		return "I am a camera";
	}

	public void snap() {
		System.out.println("Taking a picture");
	}

}

public class App {

	public static void main(String[] args) {

		// Generic Class: ArrayList
		ArrayList<Machine> list = new ArrayList<>();

		list.add(new Machine());
		list.add(new Machine());

		showList(list);

		// Any parameterised class that is passed a type of a child class type is not a
		// subclass of the same parameterised class as the parent class as the type
		// parameter
		ArrayList<Camera> list1 = new ArrayList<>();

		list1.add(new Camera()); // Passing camera objects to a an arraylist storing machine objects
		list1.add(new Camera());

		// Polymorphism means that I can pass a list of cameras to an object storing a
		// parent class type

	}

	public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

	public static void showList2(ArrayList<? extends Machine> list) {
		// The extends keyword means that anything that is a Machine or a child class of
		// machine can be passed to this method
		// This also allows us to get a list of objects of Machine types
		for (Machine value : list) {
			System.out.println(value);
			value.start();
			// value.snap(); // Won't work because snap is not a method in Machine, which is the parent class to Camera
		}
	}
	
	public static void showList3(ArrayList<? super Camera> list) {
		// The super keyword menas that Camera or a parent class, this treats everything passed to it as Objects, you would have to downcast to get required type
		for (Object value : list) {
			System.out.println(value);
			// Class unique methods cannot be called because everything is being treated as objects
			// value.start();
			// value.snap(); 
		}
	}

}
