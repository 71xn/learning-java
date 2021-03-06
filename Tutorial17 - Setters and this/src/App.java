
// Tutorial 17
// Setter and the "this" keywords


class Frog {
	// The private means that only methods with-in the class can access the instance variables of an object created from this class
	private String name;
	private int age;
	
	// Setter Method, allows for encapsulation of internal class variables, OOP
	public void setName(String name) {
		this.name = name;
		// the "this" keyword means that the we will use the instance variable "name", rather then the "name" variable that is declared in the current method scope
		// "this" is a reference to the current object
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	
	// Getter Methods, getting a value from an instance of an object
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		// You don't need "this" because we don't have any ambiguity between variables or objects
		setName(name);
		setAge(age);
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		// Here we are accessing the internal variables of the frog class
		// Setting instance variables
		//frog1.name = "Bertie";
		//frog1.age = 1;
		
		// Accessing a method of the frog1 object
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		
	}
	
}
