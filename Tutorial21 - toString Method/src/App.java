
// Tutorial 21
// The toString() method

class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}

public class App {
	public static void main(String[] args) {
		Object obj = new Object(); // every object has the properties of the object class
		
		// Our frog1 object has inherited all the methods from the Object class, thus is has the toString method
		Frog frog1 = new Frog(7, "Bob");
		
		System.out.println(frog1); // sysout will always try and invoke an objects toString method
		
		// If an object doesn't have a defined toString method it will output the class name followed by the objects hashcode
		System.out.println(obj.toString());
		
	}
}
