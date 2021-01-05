
public class Machine {
	
	private String name = "Machine type 1"; // Because this is private, only the current scope, this class, can access it, not child classes
	protected String name2 = "Machine type 2"; // protected means that anything in the package can access it 
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
}
