
/*
 * Collections 11
 * Implementing Iterable
 */

public class App {
	
	public App() {
		UrlLibrary urllibrary = new UrlLibrary();
		
		// This can be used because we implemented the iterable interface and created an Iterator method
		for (String url : urllibrary) {
			System.out.println(url);
		}
	}
	
	public static void main(String[] args) {
		new App();
	}
	
}
