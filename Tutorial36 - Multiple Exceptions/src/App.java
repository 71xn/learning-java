import java.io.IOException;
import java.text.ParseException;

// Tutorial 36
// Multiple Exceptions


public class App {

	public static void main(String[] args) {
		Test test = new Test();
		
		// You can have multiple catch blocks in a try catch, for multiple different exceptions
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// Single catch block with two exceptions, try-multi catch
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// We can simply use Exception as all Java exceptions are subclasses of the parent Exception class, polymorphism
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
