
// Tutorial 37
// Runtime Exceptions

/*
 * Checked exceptions are exceptions that you are forced to handle, such as FileNotFound etc.
 * 
 */


public class App {
	
	public static void main(String[] args) {
		
		// Check Exceptions
		/* 
		 * Thread.sleep(111);
		 */
		
		
		// Runtime Exceptions
		
		// subclass of Exception, but not forced to handle them, no need for try catch
		// Runtime exceptions mean that there is a serious error in the code, rather then an exception that could be thrown
		/*
		 * int value = 7;
		 * value = value / 0;
		 */
		
		/*
		 * String text = null; 
		 * System.out.println(text.length());
		 */
		
		// You can catch Runtime excpetions using a try catch with either a Exception, or a RuntimeException, less common to do so
		 try {
			 String[] texts = {"one", "two", "three"}; 
			 System.out.println(texts[3]);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }

		 
	}
	
}
