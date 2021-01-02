
// Tutorial 45
// Recursion

// A subroutine calling a subroutine

public class App {
	
	public App() {
		int value = 4;
		calculate(value);
		
		System.out.println(factorial(3));
	}
	
	private static void calculate(int value) {
		System.out.println(value);
		
		if (value == 1) {
			return;
		}
		
		calculate(value - 1); // Endless recursion if no condition is present
	}
	
	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n-1) * n;
		}
	}
	
	public static void main(String[] args) {
		new App();
	}
	
}
