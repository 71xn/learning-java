 
// Tutorial 40
// Try With Resources

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh no!");
	}
	
}

public class App {
	public static void main(String[] args) {
		
		// Try-with-resources, only works with Objects that implement the Autoclosable Class, automatically runs the close method
		try (Temp temp = new Temp()) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
